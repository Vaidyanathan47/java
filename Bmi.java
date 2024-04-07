import java.util.Scanner;

public class Bmi {
	
	/**
		given a datatype double input as a weight and inch to calculate bmi
	**/
	public static double CalculateBmi(double weight,double inches) {
		return (weight * 0.45359237 / (inches * 0.0254 * inches * 0.0254));
	}	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input weights in pounds:");
		double weight = in.nextDouble();
		System.out.print("Input heights in inches:");
		double inches = in.nextDouble();
		double BMI= CalculateBmi(weight,inches);
		System.out.println(" Body Mass Index is " + BMI );
	}
 }
