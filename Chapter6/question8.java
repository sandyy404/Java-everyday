// Write a Java program to find whether an array is Sorted or not.

import java.util.Scanner;

public class question8 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        boolean isAscending =true;
        boolean isDecending =true;
        System.out.print("Enter the no of row in the array:-");
        int a = sc.nextInt();
        System.out.println();
        System.out.print("Enter the no of column in the array:-");
        int b = sc.nextInt();
        int[][] arr = new int[a][b];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                //  System.out.print("Enter the element of the array:-");
                arr[i][j] = sc.nextInt();
            }
        }
        // Compare elements in same row and last of row with first of next row

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length-1; j++) {
                if (arr[i][j] <= arr[i][j + 1]) {
                  isDecending = false;
                } else if (arr[i][j] >= arr[i][j + 1]) {
                 isAscending =false;
                } 
               }

               // Compare last element of current row with first element of next row
               if (i < a - 1) {  // Make sure next row exists
                if (arr[i][b - 1] < arr[i + 1][0]) {
                    isDecending = false;
                } else if (arr[i][b - 1] > arr[i + 1][0]) {
                    isAscending = false;
                }
            }
            }
            if(isAscending == true){
               System.out.println("sorted ascending");
            }else if(isDecending ==true){
               System.out.println("sorted decending");
            }else{
               System.out.println("not sorted");
            }

    }
}