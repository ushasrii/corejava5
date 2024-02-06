package ai.dv.ui;
import java.util.Scanner;
public class Program16EvenOdd {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter no of cells: ");
		int size = scan.nextInt();
		int[] arr = new int[size];
		int i;
		for(i=0;i<size;i++) {
			System.out.print("Enter values: ");
			arr[i] = scan.nextInt();
		}
		for(i=0;i<size;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]+" is Even");
			}else {
				System.out.println(arr[i]+" is Odd");
			}
		}
		scan.close();
	}

}
