import demos.Airport;

public class airportPrac {
	
	private String city;
	private String country;
	private String code3;
	
	public String getCity() {
		return this.city;
	}
	
	public String getCountry() {
		return this.country;
	}
	
	public String getCode() {
		return this.code3;
	}
	
	//linear search
	public static String findAirportCode(String toFind, Airport[] airports) {
		
		for (int i = 0; i < airports.length; i++) {
			if (airports[i].getCity().equals(toFind)) {
				return airports[i].getCode3();
			}			
		}
		return "No Airport found for given city.";
		
	}
	
	//binary search example
	public static String findAirportCodeBS(String toFInd, Airport[] airports) {
		int low = 0;
		int high = airports.length;
		int mid;
		while (low <= high) {
			mid = (low + high)/2;
			// to guard against possible overflow use below code
			// overflow happens when array or list is HUGE
			// mid = low + ((high - low)/2)
			int compare = toFInd.compareTo(airports[mid].getCity());
			if (compare < 0) {
				high = mid - 1;
			}
			else if (compare > 0) {
				low = mid + 1;
			}
			else {
				return airports[mid].getCode3();
			}
			
			return "No Airport found for given city";
		}
	}

}
