// Write a program to print muliplicatiom table of 10 in reverse order.
  import java.util.Scanner;
public class question5_5 {
  


   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in); 
      //  System.out.print("Enter the number:-");
      //  int num = sc.nextInt();
      int num =10;
       int n=10;
       while(n>=1){
        int i =num * n;
         n--;
         System.out.println(i);

       }
   }
   
}


