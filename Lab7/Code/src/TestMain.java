import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		
		int m1 = 0;
		int m2 = 0;
		int m3 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks 1: ");
		m1 = sc.nextInt();
		System.out.println("Enter marks 2: ");
		m2 = sc.nextInt();
		System.out.println("Enter marks 3: ");
		m3 = sc.nextInt();
		ResultFinder finder = new ResultFinder();
		finder.setMarks(m1, m2, m3);
		finder.displayMarks();
		
		System.out.println("Total : " + finder.getTotal());
		System.out.println("Average : " + finder.getAverage());
		System.out.println("Result : " + finder.getResult());
	}
}
