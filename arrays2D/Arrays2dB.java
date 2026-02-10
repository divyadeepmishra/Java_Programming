package arrays2D;

import java.util.Scanner;

public class Arrays2dB {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter no. of coloumns: ");
        int n = sc.nextInt();

        boolean[][] arr = new boolean[m][n]; // 2D array declaration and initialization

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter value at " + i + " " + j + " index: ");
                arr[i][j] = sc.nextBoolean();
            }
        }

        // Print
        System.out.println("2D array is: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
