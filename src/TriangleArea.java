import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a side A, please ");
        double sideA = scanner.nextDouble();
        System.out.println("Enter height, please ");
        double height = scanner.nextDouble();

        System.out.println("The triangle's are is = " + ((sideA * height) / 2 ));
    }
}
