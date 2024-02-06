package ai.dv.ui;
import java.util.Scanner;
public class Program21ReverseFunction {
	static int reverse(int originalNumber) {
		int digits=originalNumber;
		int rev=0;
		while(digits>0) {
			int k = digits%10;
			rev = rev*10+k; 
			digits=digits/10;
		}
		return rev;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter value:");
		int number = scan.nextInt();
		int result = reverse(number);
		System.out.println("The reversed number is: "+result);
		scan.close();
	}

}
