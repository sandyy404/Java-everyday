

import java.util.Scanner;

public class question2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the salary:-");
        int salary = sc.nextInt();
        if (salary < 250000) {
            System.out.println("Empolyee do not need to pay tax");
        } else if (salary >= 250000 && salary < 500000) {
            System.out.println("Empolyee should pay 5% tax");
            System.out.println("Tax:-" + salary * 5 / 100);
        } else if (salary >= 500000 && salary <= 1000000) {
            System.out.println("Empolyee should pay tax");
            System.out.println("Total tax:- " + ((500000 * 5 / 100) + ((salary - 500000) * 20 / 100)));
        } else if (salary > 1000000) {
            System.out.println("Empolyee should pay tax");
            System.out.println("Total tax:- " + ((250000 * 5 / 100) + ((500000) * 20 / 100) + ((salary - 1000000) * 30 / 100)));
        } else {
            System.out.println("Bhai tu alag hai");
        }
        sc.close();
    }

}
