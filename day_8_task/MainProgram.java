package addon_day8;
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int[] intArray = {10, 20, 30, 40, 50};
        double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        String[] stringArray = {"apple", "banana", "cherry"};

        System.out.print("Enter a value to search: ");
        String input = scanner.nextLine();

       
        if (isInteger(input)) {
            int intValue = Integer.parseInt(input);
            boolean found = search(intArray, intValue);
            System.out.println("Integer " + intValue + (found ? " found." : " not found."));
        } else if (isDouble(input)) {
            double doubleValue = Double.parseDouble(input);
            boolean found = search(doubleArray, doubleValue);
            System.out.println("Double " + doubleValue + (found ? " found." : " not found."));
        } else {
            boolean found = search(stringArray, input);
            System.out.println("String \"" + input + "\"" + (found ? " found." : " not found."));
        }

        scanner.close();
    }

    public static boolean search(int[] array, int value) {
        for (int i : array) {
            if (i == value) return true;
        }
        return false;
    }

    public static boolean search(double[] array, double value) {
        for (double d : array) {
            if (d == value) return true;
        }
        return false;
    }

    public static boolean search(String[] array, String value) {
        for (String s : array) {
            if (s.equalsIgnoreCase(value)) return true;
        }
        return false;
    }

    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return str.contains(".");
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
