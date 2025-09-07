/* Write a program using function to print the following pattern.
*
**
***
**** 
*/
public class question2 {
   static void pattern(){
      for(int i = 0;i<4;i++){
         for(int j = 0; j<=i;j++){
            System.out.print("*");
         }
         System.out.println();
      }
   }
public static void main(String[] args) {
    System.out.println("The pattern is:");
     pattern();
}
   
}
