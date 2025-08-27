import java.util.Scanner;

public class question4_5 {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in); 
       System.out.print("Enter the number:-");
       int num = sc.nextInt();
     
       int n=1;
       while(n<=10){
        int i =num * n;
         n++;
         System.out.println(i);

       }
   }
   
}
