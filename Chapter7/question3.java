// Write a recursive function to calculate sum of first n natural number.

public class question3 {

    static int recursive_sum(int n) {
        if (n < 0) {
            System.out.println("Please enter n minimum 1!");
        } else {
            int sum
            (0) = 0;
      sum(n) = n + sum(n - 1);
        }

        return sum(n);
    }

    public static void main(String[] args) {

    }

}
