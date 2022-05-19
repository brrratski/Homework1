import java.util.Scanner;

public class TriangleParameter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side A, please ");
        double sideA = scanner.nextDouble();
        System.out.println("Enter side B, please ");
        double sideB = scanner.nextDouble();
        System.out.println("Enter side C, please ");
        double sideC = scanner.nextDouble();

        System.out.println("The triangle parameter is = " + (sideA + sideB + sideC));


    }
}
