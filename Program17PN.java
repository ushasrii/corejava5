package ai.dv.ui;
import java.util.Scanner;
public class Program17PN {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter no of cells: ");
		int size = scan.nextInt();
		int[] arr = new int[size];
		int i;
		for(i=0;i<size;i++) {
			System.out.print("Enter Value: ");
			arr[i] = scan.nextInt();
		}
		for(i=0;i<size;i++) {
			if(arr[i]>0) {
				System.out.println(arr[i]+" is Positive number");
			}else {
				System.out.println(arr[i]+" is Negative number");
			}
		}
	}

}
