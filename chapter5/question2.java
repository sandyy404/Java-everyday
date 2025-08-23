/*pattern 
*
** 
*** 
**** 
*/
import java.util.Scanner;

public class question2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = '*';
        int n = sc.nextInt();
        for (int i = 1; i<=n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a);
            }
            System.out.println();
        }
    }
}
