package ai.dv.ui;
import java.util.Scanner;
public class Program14BigSmall {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter no of cells: ");
		int size = scan.nextInt();
		int[] arr = new int[size];
		int i;
		for(i=0;i<size;i++) {
			System.out.print("Enter value: ");
			arr[i] = scan.nextInt();
		}
		int max=arr[0],min=arr[0];
		for(i=0;i<size;i++) {
			if(arr[i]>max) {
				max = arr[i];
				
			}else if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("The Biggest value is: "+max);
		System.out.println("The Smallest Value is: "+min);
		scan.close();
	}
}
