import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a firts value: ");
        double value01 = scanner.nextDouble();

        System.out.println("Enter a second value: ");
        double value02 = scanner.nextDouble();

        System.out.println("Enter a third value: ");
        double value03 = scanner.nextDouble();

        double geometricMean = Math.pow(value01 * value02 * value03, 1.0 / 3.0);

        System.out.println("The geometric mean of the values is: " + geometricMean);

        scanner.close();
    }
}
