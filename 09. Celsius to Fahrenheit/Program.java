import java.util.Scanner;

public class degrees {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		double celsius = Double.parseDouble(console.nextLine());

		double farenheit = celsius * 1.8 + 32;

		System.out.printf("The temperature is %.2f F.", farenheit);
	}
}
