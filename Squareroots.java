import java.util.Scanner;

public class Squareroots{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input Value:");
		double val = in.nextDouble();
		
		System.out.printf("Square: %12.2\n", val * val);
        System.out.printf("Cube: %14.2\n", val * val * val);
        System.out.printf("Fourth power: %6.2\n", Math.pow(val, 4));
		
	}
}
