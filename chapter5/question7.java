
import java.util.Scanner;

// Repeat 6 using while loop
public class question7 {
   public static void main(String[] args) {
       Scanner sc =  new Scanner(System.in);
       System.out.print("Enter the number:-");
       int n =sc.nextInt();
       int i = 2;
       int fact =1;

       while(i<=n){
         fact*=i;
         i++;
         //  System.out.println(num);
       }
       System.out.println(fact);

   }
}
