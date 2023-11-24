import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        System.out.println("Enter the heigth of the rectangle: ");
        double heigth = scanner.nextDouble();

        double perimeter = 2 * (width + heigth);
        double area = width * heigth;

        System.out.println("The perimeter of the rectangle is: " + perimeter);
        System.out.println("The area of the rectangle is: " + area);

        scanner.close();
    }

}
