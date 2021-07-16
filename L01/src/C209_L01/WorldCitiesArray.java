package C209_L01;


public class WorldCitiesArray {

	public static void main(String[] args) {
		
		String[] cityArr = {"Singapore", "Kuala Lumpur", "Seoul", "Bandung"};
		
		int numberOfCities = cityArr.length;
		cityArr[2] = "Taipei";
		cityArr[0] = null;
	
		for (int i = 0; i < cityArr.length; i++) {
			System.out.println(cityArr[i]);
		}
		System.out.println("Number of cities: " + numberOfCities);

	}

}
