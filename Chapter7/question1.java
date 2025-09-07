
import java.util.Scanner;

//Write a Java method to print multiplication table of a number n.
public class question1 {

    static int num1;

    static int multi_table(int num) {
        for (int table = 1; table < 11; table++) {
            num1 = table * num;
            // System.out.println(num1);
        }
        return num1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:-");
        int n = sc.nextInt();
        multi_table(n);
    }

}
