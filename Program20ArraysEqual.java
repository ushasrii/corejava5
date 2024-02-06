package ai.dv.ui;
import java.util.Scanner;
public class Program20ArraysEqual {
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		System.out.println("Enter size of Matrix1: ");
		int rows1 = scan.nextInt();
		int cols1 = scan.nextInt();
		System.out.println("Enter size of Matrix2: ");
		int rows2 = scan.nextInt();
		int cols2 = scan.nextInt();
		if (rows1 != rows2 || cols1 != cols2) {
			System.out.println("Not Equal");
	        System.exit(0);
	        }
		int[][] arr1 = new int[rows1][cols1];
	    int[][] arr2 = new int[rows2][cols2];
	    int i, j;
	    System.out.println("Enter values in Matrix1: ");
	    for (i = 0; i < rows1; i++) {
	    	for (j = 0; j < cols1; j++) {
	    		arr1[i][j] = scan.nextInt();
	    		}
	        }
	    System.out.println("Enter values in Matrix2: ");
	    for (i = 0; i < rows2; i++) {
	        for (j = 0; j < cols2; j++) {
	            arr2[i][j] = scan.nextInt();
	            }
	        }
	    for(i=0;i<rows1;i++) {
	    	for(j=0;j<cols1;j++) {
	    		if(arr1[i][j] != arr2[i][j]) {
	    			System.out.println("Not Equal");
	    			System.exit(0);
	    		}
	    	}
	    }
	    System.out.println("Equal");
	    scan.close();

	}

}
