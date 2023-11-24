import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the weight in kilograms: ");
        double weight = scanner.nextDouble();

        System.out.println("What is the height in meters: ");
        double height = scanner.nextDouble();

        double bmi = (weight / (height * height));

        System.out.println("Your BMI is: " + bmi);

        scanner.close();
    }
}
