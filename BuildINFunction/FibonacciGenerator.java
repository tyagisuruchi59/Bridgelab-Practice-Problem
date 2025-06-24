package BuildInFunction;
import java.util.Scanner;

public class FibonacciGenerator {
    static void printFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci sequence: " + a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        printFibonacci(n);
    }
}
