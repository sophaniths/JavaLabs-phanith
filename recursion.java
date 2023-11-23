import java.util.Scanner;

public class recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = input.nextDouble();
        System.out.print("Enter n: ");
        double n = input.nextDouble();
        System.out.println(power(x, n));
    }

    public static double power(double x, double n) {
        if (n == 0) {
            return 1;
        } else if (n > 0) {
            return x * power(x, n - 1);
        } else {
            return 1 / (x * power(x, -n - 1));
        }
    }
}