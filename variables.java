import java.util.Scanner;
public class variables{
	
	public static void main(String args[]) {
		int integer_A = 35, integer_B = 10;
		double dub_A= 1.2333333, dub_B= 0.7777777;
		Scanner scan_C = new Scanner(System.in);
		String dub_C = scan_C.nextLine();
		System.out.println("C(input)"+dub_C);
		System.out.println("A(integer)"+integer_A);
		System.out.println("B(integer)"+integer_B);
		System.out.println("C(double)"+dub_A);
		System.out.println("D(double)"+dub_B);
	}
}