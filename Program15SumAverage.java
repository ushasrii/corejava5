package ai.dv.ui;
import java.util.Scanner;
public class Program15SumAverage {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Cells: ");
		int size = scan.nextInt();
		int[] arr = new int[size];
		int i;
		for(i=0;i<size;i++) {
			System.out.print("Enter Value: ");
			arr[i] = scan.nextInt();
		}
		int sum=0;
		double average;
		for(i=0;i<size;i++) {
			sum = sum+arr[i];
		}
		average = (double)sum/size;
		System.out.println("The sum of an Array is: "+sum);
		System.out.println("The average of an Array is: "+average);
		scan.close();
	}

}
