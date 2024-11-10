package HarshdeepSingh_sec002_ex02;

public class Main {
    public static void main(String[] args) {
        Double[] grades = { 56.7, 89.23, 45.56, 88.40, 90.56 };
        String[] product = { "iphone", "Galaxy", "Pixel", "Nokia" };
        Character[] status = { 'y', 'n', 'i', 'd', 'e' };

        System.out.println("Double array:");
        printArray(grades);
        System.out.println("\nString array:");
        printArray(product);
        System.out.println("\nCharacter array:");
        printArray(status);

        // Test version 2.0
        System.out.println("\nDouble array (version 2.0):");
        printArray(grades, 2);
        System.out.println("\nString array (version 2.0):");
        printArray(product, 1);
        System.out.println("\nCharacter array (version 2.0):");
        printArray(status, 3);

        // Test version 3.0
        System.out.println("\nDouble array (version 3.0):");
        printArray(grades, 1, 3);
        System.out.println("\nString array (version 3.0):");
        printArray(product, 0, 2);
        System.out.println("\nCharacter array (version 3.0):");
        printArray(status, 2, 4);
    }

    // Version 1.0
    public static <T> void printArray(T[] inputArray) {
        for (T element : inputArray) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Version 2.0
    public static <T> void printArray(T[] inputArray, int startIndex) {
        if (startIndex < 0 || startIndex >= inputArray.length) {
            throw new IllegalArgumentException("Invalid startIndex");
        }
        for (int i = startIndex; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
        System.out.println();
    }

    // Version 3.0
    public static <T> void printArray(T[] inputArray, int startIndex, int endIndex) {
        if (startIndex < 0 || endIndex < 0 || startIndex >= inputArray.length || endIndex >= inputArray.length || startIndex > endIndex) {
            throw new IllegalArgumentException("Invalid indices");
        }
        for (int i = startIndex; i <= endIndex; i++) {
            System.out.print(inputArray[i] + " ");
        }
        System.out.println();
    }
}
