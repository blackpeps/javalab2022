import java.util.Scanner;
public class matrixMultiplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Matrix A\nRow: ");
		int r1 = sc.nextInt();
		System.out.print("Column: ");
		int c1 = sc.nextInt();
		int r2 = c1;
		System.out.print("Matrix B\nRow: " + r2 + "\nColumn: ");
		int c2 = sc.nextInt();
		int m1[][] = new int[r1][c1], m2[][] = new int[r2][c2];
		int mr[][] = new int[r1][c2];
		System.out.println("Enter values to Matrix A");
		for (int i = 0; i < r1; i++)
			for (int j = 0; j < c1; j++) {
				System.out.print("m1[" + i + "][" + j + "] = ");
				m1[i][j] = sc.nextInt();
			}
		System.out.println("Enter values to Matrix B");
		for (int i = 0; i < r2; i++)
			for (int j = 0; j < c2; j++) {
				System.out.print("m2[" + i + "][" + j + "] = ");
				m2[i][j] = sc.nextInt();
			}
		for (int i = 0; i < r1; i++)
			for (int j = 0; j < c2; j++) {
				mr[i][j] = 0;
				for (int k = 0; k < r2; k++)
					mr[i][j] += m1[i][k] * m2[k][j];
			}
		System.out.println("Matrix A");
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c1; j++)
				System.out.print(m1[i][j] + "\t");
			System.out.println();
		}
		System.out.println("Matrix B");
		for (int i = 0; i < r2; i++) {
			for (int j = 0; j < c2; j++)
				System.out.print(m2[i][j] + "\t");
			System.out.println();
		}
		System.out.println("Matrix Resultant");
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c2; j++)
				System.out.print(mr[i][j] + "\t");
			System.out.println();
		}
	}
}
