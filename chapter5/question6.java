
import java.util.Scanner;

// White a program fo find factorial of a given number using for loop
public class question6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:-");
        int n = sc.nextInt();
        for (int i = n - 1; i >= 1; i--) {
            n *= i;

        }
        System.out.println(n);

    }
}
