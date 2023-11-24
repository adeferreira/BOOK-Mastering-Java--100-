import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of the A: ");
        double a = scanner.nextDouble();

        System.out.println("Enter the value of the B: ");
        double b = scanner.nextDouble();

        System.out.println("Enter the value of the C: ");
        double c = scanner.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;

        System.out.println("The delta value is: " + delta);

        scanner.close();
    }
}
