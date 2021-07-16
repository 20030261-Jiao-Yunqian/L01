package C209_L01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 20658, 21 Apr 2021 2:53:50 pm
 */

public class MyBirthday {

	public static void main(String[] args) {
		
        LocalDate birthDate = LocalDate.of(2000, 01, 03);
        
        DateTimeFormatter ft = DateTimeFormatter.ofPattern("MMMM");
        DateTimeFormatter ft2 = DateTimeFormatter.ofPattern("EEEE");


        
        System.out.println("I was born in " + birthDate.getYear());
        System.out.println("The month that I was born in was: " + birthDate.format(ft));
        System.out.println("The day I was born in was: " + birthDate.format(ft2));


	}

}
