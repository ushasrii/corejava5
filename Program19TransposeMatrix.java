package ai.dv.ui;
import java.util.Scanner;
public class Program19TransposeMatrix {
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		System.out.println("Enter number of rows of the matrix: ");
	    int rows = scan.nextInt();
	    System.out.println("Enter number of columns of the matrix: ");
	    int cols = scan.nextInt();
		int[][] original = new int[rows][cols];
		int[][] transpose = new int[cols][rows];
		int i,j;
		System.out.println("Enter Original values in Matrix: ");
		for(i=0;i<rows;i++) {
			for(j=0;j<cols;j++) {
				original[i][j] = scan.nextInt();
			}
		}
		System.out.println("Values in Original Matrix: ");
		for(i=0;i<rows;i++) {
			for(j=0;j<cols;j++) {
				System.out.print(original[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("Matrices After transposed: ");
		for(i=0;i<rows;i++) {
			for(j=0;j<cols;j++) {
				transpose[i][j] = original[j][i];
				System.out.print(transpose[i][j]+"\t");
			}
			System.out.println();
		}
		scan.close();
	}

}
