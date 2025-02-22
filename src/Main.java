import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = 0, height = 0;

        while (true) {
            System.out.print("Enter the width of the rectangle: ");
            if (scanner.hasNextDouble()) {
                width = scanner.nextDouble();
                if (width > 0) break;
            }
            scanner.nextLine();
            System.out.println("Invalid input. Please enter a positive number.");
        }

        while (true) {
            System.out.print("Enter the height of the rectangle: ");
            if (scanner.hasNextDouble()) {
                height = scanner.nextDouble();
                if (height > 0) break;
            }
            scanner.nextLine();
            System.out.println("Invalid input. Please enter a positive number.");
        }

        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt((width * width) + (height * height));

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Diagonal: " + diagonal);
    }
}
