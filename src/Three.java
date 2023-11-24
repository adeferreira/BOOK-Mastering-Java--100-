import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter to first note: ");
        double note01 = scanner.nextDouble();
        System.out.println("Enter to second note: ");
        double note02 = scanner.nextDouble();
        System.out.println("Enter to third note: ");
        double note03 = scanner.nextDouble();

        double average = (note01 + note02 + note03) / 3;

        System.out.println("The average of the three scores is: " + average);

        scanner.close();
    }

}
