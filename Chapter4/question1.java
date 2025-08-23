

import java.util.Scanner;

public class question1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the mark of subject1:-");
        float subject1 = sc.nextFloat();
        System.out.print("Enter the mark of the subject2:-");
        float subject2 = sc.nextFloat();
        System.out.print("Enter the mark of the subject3:-");
        float subject3 = sc.nextFloat();
        float sum = (subject1 + subject2 + subject3);
        System.out.print("The sum is:- " + sum);
        System.out.println();
        float percentage = sum / 3;
        System.out.print("The percentage is:- " + percentage);
        System.out.println();
        if (subject1 >= 33 && subject2 >= 33 && subject3 >= 33 && percentage >= 40) {
            System.out.println("Student is pass");
        } else {
            System.out.println("Student is fail");
        }
        sc.close();
    }

}
