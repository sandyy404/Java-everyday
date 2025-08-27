
import java.util.Scanner;

public class question3 {

    public static void main(String[] args) {
        System.out.print("Enter the number of terms:-");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1;

        int num = 2;
        int sum = 0;
        while (i <= n) {

            sum += num;
            num += 2;
            i++;

        }
        System.out.println(sum);

    }
}
