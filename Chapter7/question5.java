//  Write a function to print nth term of fibonacci series using recursion

import java.util.Scanner;

public class question5 {

    static int fib(int num) {
        if (num == 1) {
            return 0;
        } else if (num == 2) {
            return 1;
        } else {
            return fib(num - 1) + fib(num - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the term:-");
        int n = sc.nextInt();
        if(n<=0){
         System.out.println("Please enter a positive integer greater than 0");
        }
        else{
         int result =fib(n);
         System.out.println("The " + n + " term of the fibonacci series is:- "+ result );
        }
    }

}
