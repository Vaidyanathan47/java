import java.util.Scanner;

public class Split {

	/** reversing the number **/
	public static int reverseNum(int number) {
		int rev = 0;
		while(number != 0 ) {
			int temp = number % 10;
			rev = rev * 10 + temp;
			number = number / 10;
		}
		return rev;
	}

	/** splitting of the reversed number in reverse order by adding space to it**/
	public static void printDigits(int number) {
		while(number!=0) {
			int digit = number % 10;
			System.out.print(digit + " ");
			number = number / 10;
		}
	}
	/** calling the function **/
	public static void main(String[] args) { 
		Scanner in = new Scanner(System.in);
		System.out.print("Input Six non-negative digits:");
		int number = in.nextInt();
		int reversedNum = reverseNum(number);
		printDigits(reversedNum);
	}
 }