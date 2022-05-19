import java.util.Scanner;

public class WholeName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter you first name, please ");
        String firstName = scanner.nextLine();
        System.out.println("Enter you middle name, please ");
        String secondName = scanner.nextLine();
        System.out.println("Enter you last name, please ");
        String thirdName = scanner.nextLine();

        System.out.println("Your full name is: " + firstName + " " + secondName + " " + thirdName);
    }
}
