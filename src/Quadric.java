import java.util.Scanner;

public class Quadric {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quadric formula = ax(2) +bx+ c");

        System.out.println("Enter value of a");
        double a = scanner.nextDouble();

        System.out.println("Enter value of b");
        double b = scanner.nextDouble();

        System.out.println("Enter value of c");
        double c = scanner.nextDouble();

        double D = (b * b) - (4 * a * c);


        if (a == 0) {
            double x0;
            x0 = -c / b;
            System.out.println("Only one root");
            System.out.println("X=" + x0);
        } else {
            if (D < 0) {
                System.out.println("No real roots");
            } else {
                double x1;
                double x2;

                x1 = (-(b) + (Math.sqrt(D))) / (2 * a);
                x2 = (-(b) - (Math.sqrt(D))) / (2 * a);

                System.out.println("The roots are: ");
                System.out.println("X1 = " + x1);
                System.out.println("X2 = " + x2);
            }
        }
    }
}