package C209_L01;

public class Country {
	
	public String name;
	public double averageYearlyTempC;
	public String thingsToDo;
	
	public Country(String name, double averageYearlyTempC, String thingsToDo) {
		this.name = name;
		this.averageYearlyTempC = averageYearlyTempC;
		this.thingsToDo = thingsToDo;
	}
	
	public void display() {
		Helper.line(40, "-");
		System.out.println("COUNTRIES");
		Helper.line(40, "-");
		System.out.println(name);

	}
	
}
