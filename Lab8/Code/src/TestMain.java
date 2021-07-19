import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		
		DecimalSplitter ds = new DecimalSplitter();
		double num = 0;
		int whole = 0;
		double fraction = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter double number: ");
		num = sc.nextDouble();
		whole = ds.getWhole(num);
		fraction = ds.getFraction(num);
		

// complete the statements

		System.out.println("Whole : " + whole);
		System.out.printf("Fraction : %.3f\n" , fraction);

		System.out.println("The number is " + (DecimalSplitter.isOdd(whole) ? "Odd" : "Even"));
	}
}
