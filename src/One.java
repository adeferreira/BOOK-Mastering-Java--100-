import java.util.Scanner;

public class One {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a value: ");
        double number01 = scanner.nextDouble();

        System.out.println("Enter a second value: ");
        double number02 = scanner.nextDouble();

        double addition = (number01 + number02);
        double subtraction = (number01 - number02);
        double multiplication = (number01 * number02);
        double division = (number01 / number02);

        System.out.println("The sum is: " + addition);
        System.out.println("The subtraction is: " + subtraction);
        System.out.println("The multiplication is: " + multiplication);
        System.out.println("The division is: " + division);

        scanner.close();
    }

}
