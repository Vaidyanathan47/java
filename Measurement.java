import java.util.Scanner;

public class Measurement {
	
	/**
		given an input as an inch,it will convert to meter
		**/
	public static double calculateMeter(double inch) {
		return inch*0.0254;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a value for inch: ");
		double inch = in.nextDouble();
		double meter = calculateMeter(inch);
		System.out.printf("%.1f inch is %.1f meters", inch, meter);
	}
 }
