package C209_L01;

/**
 * I declare that this code was written by me. I will not copy or allow others
 * to copy my code. I understand that copying code is considered as plagiarism.
 *
 * 20030261, 21 April 2021 10:12:54 am
 */

public class TemperatureConversion {

	public static void main(String[] args) {
		double celsius = 0.0;
		double fahrenheit = 0.0;
		String msg = null;
		int choice = 0;
		
		while (choice != 3) {
			
			Helper.line(40, "-");
			System.out.println("TEMPERATURE CONVERSION");
			Helper.line(40, "-");
			System.out.println("1. Convert Celsius to Fahrenheit");
			System.out.println("2. Convert Fahrenheit to Celsius");
			System.out.println("3. Quit");
			
			choice = Helper.readInt("Enter an option > ");

		if (choice == 1) {
		   celsius = Helper.readDouble("Enter a temperature in celsius > ");
		   fahrenheit = (celsius * 1.8) + 32;
		   msg = String.format("%.2f degrees Celsius is %.2f degrees Fahrenheit." , celsius,fahrenheit );
		}
		else if (choice == 2) {
			fahrenheit = Helper.readDouble("Enter a temperature in fahrenheit > ");
			celsius = (fahrenheit - 32)/1.8;
			msg = String.format("%.2f degrees Fahrenheit is %.2f degrees Celsius." ,fahrenheit ,celsius );
		}
		else if (choice == 3) {
			msg = "Bye!";

		}
		
		System.out.println(msg);

	  }
	}
}


