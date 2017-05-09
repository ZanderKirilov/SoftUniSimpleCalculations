import java.util.Scanner;

public class SquareArea {

	public SquareArea() {
		
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("a = ");
		int a = Integer.parseInt(console.nextLine());
		int area = a * a;
		System.out.println("Square area = " + area);
	}

}
