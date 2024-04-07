import java.util.Scanner;

public class Converter {
	
	/**
		given a datatype double input as a fahrenheit which will convert it into celsius
	**/
	public static double calculateCelcius(double fahrenheit) {
		return ((fahrenheit-32)*5/9);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a degree in fahrenheit:");
		double fahrenheit = in.nextDouble();
		double celsius = calculateCelcius(fahrenheit);
		System.out.printf("%.1f degree fahrenheit is equal to %.1f in celsius", fahrenheit, celsius);
	}
 }