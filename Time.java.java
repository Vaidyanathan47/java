import java.util.Scanner;

public class Time {
	
	/**
		given minutes to convert it into years and days
	**/
		public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input the number of minutes:");
	    double min = in.nextDouble();
		double minutesinYear= 60 *24 *365;
	    long years = (long) (min/minutesinYear);
	    int days = (int) (min/60/24)%365; 
		System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days ");
	}
 }