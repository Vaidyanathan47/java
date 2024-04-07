import java.util.Scanner;

public class Calculations{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input 1st integer:");
		int val1 = in.nextInt();
		System.out.print("Input 2nd integer:");
		int val2 = in.nextInt();
		
		System.out.println("Sum of two integers:" + (val1 + val2));            
        System.out.println("Difference of two integers:" + (val1 - val2));
        System.out.println("Average of two integers:" + (val1 + val2)/2);
		System.out.println("Product of two integers:" + (val1*val2));
        System.out.println("Distance of two integers:" + Math.abs(val1 - val2));
		System.out.println("Max Integer " + (val1 > val2 ? val1 : val2));
		System.out.println("Min Integer " + (val1 < val2 ? val1 : val2));
	}
}
