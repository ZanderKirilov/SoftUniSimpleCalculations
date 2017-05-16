import java.util.Scanner;
import javax.swing.*;

public class CurencyConverter {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		double amount = Double.parseDouble(console.nextLine());
		String inputCurrency = console.nextLine();
		String outputCurrency = console.nextLine();
		double total = 0;
		
		switch(inputCurrency)
        {
            case "USD":
                switch(outputCurrency)
                {
                    case "BGN": total = amount * 1.79549; break;
                    case "EUR": total = (amount * 1.79549) / 1.95583; break;
                    case "GBP": total = (amount * 1.79549) / 2.53405; break;
                }break;
            case "BGN":
                switch(outputCurrency)
                {
                    case "USD": total = amount / 1.79549; break;
                    case "EUR": total = amount / 1.95583; break;
                    case "GBP": total = amount / 2.53405; break;
                }break;
            case "EUR":
                switch(outputCurrency)
                {
                    case "BGN": total = amount * 1.95583; break;
                    case "USD": total = (amount * 1.95583) / 1.79549; break;
                    case "GBP": total = (amount * 1.95583) / 2.53405; break;
                }break;
            case "GBP":
                switch(outputCurrency)
                {
                    case "BGN": total = amount * 2.53405; break;
                    case "USD": total = (amount * 2.53405) / 1.79549; break;
                    case "EUR": total = (amount * 2.53405) / 1.95583; break;
                }break;
        }
        System.out.printf("%.2f %s", total, outputCurrency);
	}

}
