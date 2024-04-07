import java.util.Scanner;

public class Sum {
	
	/**
		given a datatype int input as a number which will calculate the sum of the number
	**/
	public static int calculateSum (int number) { int sum=0;
	while(number!=0)
	{
	    sum= sum+number%10;
		number=number/10;
	}	
			return(sum);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input an integer between 0 and 1000:");
		int number = in.nextInt();
		int sum = calculateSum(number);
		System.out.println(" the sum of all digits in " + number + " is " + sum );
	}
 }