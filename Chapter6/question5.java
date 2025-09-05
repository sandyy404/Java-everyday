//  Reverse of the array

import java.util.Scanner;

public class question5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of the array:-");
        int[][] arr = new int[3][3];
        int[][] reverse_arr = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }

        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                reverse_arr[i][j] = arr[2 - i][2 - j];

            }
        }
        System.out.println("Reverse Array");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(reverse_arr[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}
