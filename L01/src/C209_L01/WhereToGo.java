package C209_L01;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 * I declare that this code was written by me. I will not copy or allow others
 * to copy my code. I understand that copying code is considered as plagiarism.
 *
 * 20030261, 21 April 2021 12:29:20pm
 */

public class WhereToGo {
	public static void main(String[] args) {
		
		ArrayList<Country> countryList = new ArrayList<Country>();
		countryList.add(new Country("Thailand", 26.30, "Food, Massage, Shopping "));
		countryList.add(new Country("Singapore", 26.45, "Food, Shopping"));
		countryList.add(new Country("France", 10.70, "Skiing, Sight Seeing"));
		countryList.add(new Country("Iceland", 1.75, "Hot Spring, Aurora"));
		countryList.add(new Country("Japan", 11.15, "Food, Mount Fuji"));

		//Refer to the sample flow and write code to match the requirements.
		//Hint: Refer to section F of your worksheet.
    	int option = 0;
	    
	    while (option != 4) {
	    	
	    	WhereToGo.menu();
		    option = Helper.readInt("Enter an option > ");
	    	
	    	if (option == 1) {
	    		WhereToGo.countriesByTemp(countryList, 1);
	    	}
	    	else if (option == 2) {
	    		WhereToGo.countriesByTemp(countryList, 2);
	    	}
	    	else if (option == 3) {
	    		WhereToGo.searchString(countryList);
	    	}
	    	else if (option == 4) {
	    		System.out.println("GoodBye!");
	    	}
	    }
		
		
		
		
		
		
	}

	public static void menu() {
		//Write code to display current date and menu here
		LocalDate currentDate = LocalDate.now();
        DateTimeFormatter ft = DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy");
        String result = currentDate.format(ft);

		Helper.line(30, "-");
        System.out.println(result);
		System.out.println("WHERE TO GO?");
		Helper.line(30, "-");
		System.out.println("1. Warmer countries");
		System.out.println("2. Cooler countries");
		System.out.println("3. Search for recommendations by activity");
		System.out.println("4. Quit");

	}

	public static void countriesByTemp(ArrayList<Country> countryList, int option) {
		//Write code here to display warm or cold countries depending on the choice by the user.
		ArrayList<String> warmer = new ArrayList<String>();
		ArrayList<String> cooler = new ArrayList<String>();

			if (option == 1) {
				for (int i = 0; i < countryList.size(); i++) {
				    if (countryList.get(i).averageYearlyTempC >= 20.00) {
					    warmer.add(countryList.get(i).name);
					    System.out.println(warmer.get(i));
				}
		   	  }	
			}
			else if (option == 2){
				for (int a = 0; a < countryList.size(); a++) {
				    if(countryList.get(a).averageYearlyTempC < 20.00) {
				        cooler.add(countryList.get(a).name);
				        System.out.println(cooler.get(a));
				}
			}
		  }
		}

	public static void searchString(ArrayList<Country> countryList) {
		//Write code here to prompt user to enter an activity
		//and display countries that have that activity.
		String activity = Helper.readString("Enter a search term > ");
		
		for (int b = 0; b < countryList.size(); b++) {
			if (countryList.get(b).thingsToDo.contains(activity)) {
				countryList.get(b).display();
			}
		}
		
	}
}
