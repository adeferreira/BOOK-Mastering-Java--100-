import java.util.Scanner;

public class Six {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius the circle: ");
        double radius = scanner.nextDouble();

        double perimeter = 2 * Math.PI * radius;

        System.out.println("The perimeter of the circle is: " + perimeter);

        scanner.close();
    }
}
