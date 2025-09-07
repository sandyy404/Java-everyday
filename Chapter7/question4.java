/* Write a function to print the folbwing pattern.
****
***
**
*
  */


public class question4 {
   static void pattern(){
 for(int i = 0 ; i<4;i++){
   for(int j = 4 ; j>i;j--){
      System.out.print("*");
   }
   System.out.println();
 }
   }
   public static void main(String[] args) {
       System.out.println("The pattern is:-");
       pattern();
   }
}
