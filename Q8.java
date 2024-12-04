import java.util.Scanner;

public class Q8 {
    public static void inputAllBaseTypes() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a byte value: ");
        byte byteValue = scanner.nextByte();

        System.out.print("Enter a short value: ");
        short shortValue = scanner.nextShort();

        System.out.print("Enter an int value: ");
        int intValue = scanner.nextInt();

        System.out.print("Enter a long value: ");
        long longValue = scanner.nextLong();

        System.out.print("Enter a float value: ");
        float floatValue = scanner.nextFloat();

        System.out.print("Enter a double value: ");
        double doubleValue = scanner.nextDouble();

        System.out.print("Enter a char value: ");
        char charValue = scanner.next().charAt(0);

        System.out.print("Enter a boolean value (true/false): ");
        boolean booleanValue = scanner.nextBoolean();

        System.out.println("You entered byte: " + byteValue);
        System.out.println("You entered short: " + shortValue);
        System.out.println("You entered int: " + intValue);
        System.out.println("You entered long: " + longValue);
        System.out.println("You entered float: " + floatValue);
        System.out.println("You entered double: " + doubleValue);
        System.out.println("You entered char: " + charValue);
        System.out.println("You entered boolean: " + booleanValue);


    }
    public static void main(String[] args) {

        inputAllBaseTypes();
    }
}
