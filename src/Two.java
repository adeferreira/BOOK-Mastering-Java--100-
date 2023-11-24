import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a value: ");
        double value01 = scanner.nextDouble();

        System.out.println("Enter a second value: ");
        double value02 = scanner.nextDouble();

        double average = (value01 + value02) / 2;

        System.out.println("The average is: " + average);

        scanner.close();
    }
}