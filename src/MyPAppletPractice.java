import processing.core.*;
import de.fhpotsdam.unfolding.*;
import de.fhpotsdam.unfolding.providers.Google;
import de.fhpotsdam.unfolding.utils.MapUtils;

public class MyPAppletPractice extends PApplet {

	private UnfoldingMap map;
	
	public void setup() {
		
		size(800,600,OPENGL);
		map = new UnfoldingMap(this,50,50,700,500, new Google.GoogleMapProvider());
		MapUtils.createDefaultEventDispatcher(this, map);
		
	}
	
	public void draw() {
		
		map.draw();
		buttons();
		
	}
	
	public void keyPressed() {
		
		if (key == 'w') {
			
			background(255,255,255);
			
		}
		
	}
	
	public void mouseReleased() {
		
		if (mouseX > 100 && mouseX < 125 && mouseY > 100 && mouseY < 125) {
			
			background(255,255,255);
			
		} else if (mouseX > 100 && mouseX < 125 && mouseY > 150 && mouseY < 175) {
		
			background(100,100,100);
		}
					
	}
	
	public void buttons() {
		
		fill(255,255,255);
		rect(100,100,25,25);
		
		fill(100,100,100);
		rect(100,150,25,25);
		
	}
}
