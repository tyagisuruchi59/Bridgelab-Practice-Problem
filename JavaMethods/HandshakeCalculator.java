package JavaMethods;

import java.util.Scanner;

public class HandshakeCalculator {

    // Method to calculate maximum number of handshakes using combination formula
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        int handshakes = calculateHandshakes(students);
        System.out.println("Maximum number of handshakes possible: " + handshakes);

        sc.close();
    }
}
