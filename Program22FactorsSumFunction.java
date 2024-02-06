package ai.dv.ui;
import java.util.Scanner;
public class Program22FactorsSumFunction {
	public static int sumOfFactors(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number:");
        int number = scan.nextInt();
        int result = sumOfFactors(number);
        System.out.println(result);
        scan.close();
    }
}


