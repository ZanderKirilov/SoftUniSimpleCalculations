import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ThousandDaysAfterBirth {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

	    String text = console.nextLine();
	    LocalDate parsedDate = LocalDate.parse(text, formatter);
	    LocalDate after1K = parsedDate.plusDays(999);
	    System.out.println(after1K.format(formatter));

	    
		
	}

}
