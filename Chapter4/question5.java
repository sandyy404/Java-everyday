

import java.util.Scanner;

public class question5 {
   public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      System.out.print("Enter the website url:");
      String url = sc.nextLine().toLowerCase();
      if(url.endsWith("com")){
    System.out.println("This is commercial website");
      }else if(url.endsWith("org")){
         System.out.println("This is organization website");
      }else if(url.endsWith("in")){
         System.out.println("This is Indian website");
      }
   }
}
