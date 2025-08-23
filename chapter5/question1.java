/* pattern 
****
***
**
*
*/
import java.util.Scanner;


public class question1 {

    public static void main(String[] args) {
        char a = '*';
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >=1; i--) {
            for (int j =1; j <=i; j++) {
                System.out.print(a);
            }
            System.out.println();
        }
    }
}
