import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.data.Feature;
import de.fhpotsdam.unfolding.data.GeoJSONReader;
import de.fhpotsdam.unfolding.marker.Marker;
import de.fhpotsdam.unfolding.providers.OpenStreetMap;
import de.fhpotsdam.unfolding.utils.MapUtils;
import processing.core.PApplet;
import java.util.*;

public class LifeEpecPractice extends PApplet {

	UnfoldingMap map;
	Map<String, Float> lifeExpeCountr;
	
	List<Feature> countries;
	List<Marker> countryMarkers;
	
	public void setup() {
		size(800, 600, OPENGL);
		map = new UnfoldingMap (this, 50, 50, 700, 500, new OpenStreetMap.OpenStreetMapProvider());
		MapUtils.createDefaultEventDispatcher(this,map);
		lifeExpeCountr = loadLifeExpectancyFromCSV("LifeExpectancyWorldBankModule3.csv");
		countries = GeoJSONReader.loadData(this, "countries.geo.json");
		countryMarkers = MapUtils.createSimpleMarkers(countries);
		map.addMarkers(countryMarkers);
		shadeCountries();
		
	}
	
	private void shadeCountries() {
		for (Marker marker : countryMarkers) {
			String countryID = marker.getId();
			
			if (lifeExpeCountr.containsKey(countryID)) {
				
				float lifeExp = lifeExpeCountr.get(countryID);
				int colorLevel = (int) map(lifeExp, 40, 90, 10, 255);
				marker.setColor(color(255-colorLevel,100,colorLevel));
			}
			else {
				
				marker.setColor(color(150,150,150));

			}
		}
	}

	public void draw() {
		map.draw();
	}
	
	private Map<String,Float> loadLifeExpectancyFromCSV(String fileName) {
		
		Map<String,Float> map = new HashMap<String,Float>();
		String[] rows = loadStrings(fileName);
		for (String row : rows) {
			//splits a comma separated file rows
			String[] columns = row.split(",");
			if (columns.length == 6 && !columns[5].equals("..")) {
				//convert string into float
				float value = Float.parseFloat(columns[5]);
				map.put(columns[4], value);
				
			}
			
		}
		return map;
	}
}
