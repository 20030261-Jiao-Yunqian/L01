package C209_L01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 20658, 21 Apr 2021 2:06:41 pm
 */

public class DateTimeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);
        
        LocalDate aDate = LocalDate.of(2016, 11, 28);
        System.out.println(aDate);
        
        System.out.println("day: " + aDate.getDayOfMonth());

        LocalTime currentTime = LocalTime.now();
        System.out.println("time: " + currentTime);
        
        LocalTime aTime = LocalTime.of(16, 56, 30);
        System.out.println(aTime);
        
        System.out.println("second: " + aTime.getSecond());
        
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);
        
        LocalDateTime aDateTime = LocalDateTime.of(2016, 11, 28, 16, 56, 30);
        System.out.println(aDateTime);
        
        //String dob = Helper.readString("Enter your DOB > ");
        
        DateTimeFormatter ft = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String d = "20/11/2000";
        LocalDate dateD = LocalDate.parse(d, ft);
        System.out.println(dateD);

        DateTimeFormatter ft2 = DateTimeFormatter.ofPattern("G yy MM,d");
        String result = dateD.format(ft2);
        System.out.println(result);


	}

}
