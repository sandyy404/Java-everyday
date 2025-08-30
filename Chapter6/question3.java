
import java.util.Scanner;

// Calculate the average marks from an array Containing marks of all students in Physics using for loop.
public class question3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students in the physics:-");
        int n = sc.nextInt();

        int[] marks = new int[n];
        int[] average_marks = new int[n];
        int a = 0;

        System.out.print("Enter the marks:-");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(marks[i]);
            average_marks[a] += marks[i];
        }
        System.out.println(average_marks[a] / 3);

    }
}
