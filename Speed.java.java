import java.util.Scanner;

public class Speed{
	
	/**
		given distance,hour,minutes,seconds to calculate the speed in meters/seconds,km/h,miles/h
	**/
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		float timeseconds;
		float mps,kph,mph;
		
		System.out.print("Input distance in meters:");
		float distance = in.nextFloat();

		System.out.print("Input hour:");
		float hr = in.nextFloat();

        System.out.print("Input minutes:");
        float min = in.nextFloat();

		System.out.print("Input seconds:");
		float sec = in.nextFloat();
		
		timeseconds = (hr*3600) + (min*60) + sec;
		mps = distance/timeseconds;
	    kph = (distance/1000.0f)/(timeseconds/3600.0f);
		mph = kph / 1.609f;
		
		System.out.println(" Your Speed in meters/seconds is " + mps);
		System.out.println(" Your Speed in km/h is " + kph);
		System.out.println(" Your Speed in miles/h is " + mph);
	}
 }