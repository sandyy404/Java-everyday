
import java.util.Scanner;

// Write a program to find out  wheather a given interger is present in array or not
public class question2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:-");
        int a = sc.nextInt();
        int[] arr = {45, 57, 89, 39, 80, 90, 23};
        boolean found =false;
        for (int i = 0; i < 7; i++) {
            if (a == arr[i]) {
                found =true;
            }
        }
        if(found){
         System.out.println("Enter number is present in the array");
        }
        else{
         System.out.println("The enter number is not present in the array");
        }
    }
}
