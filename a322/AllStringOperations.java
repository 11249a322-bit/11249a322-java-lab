public class AllStringOperations {
    public static void main(String[] args) {

        String str = "Hello Java";
        String str2 = "Hello World";

        // 1. Length
        System.out.println("Length: " + str.length());

        // 2. Character at index
        System.out.println("Character at index 1: " + str.charAt(1));

        // 3. Concatenation
        System.out.println("Concatenation: " + str.concat(" Programming"));

        // 4. Uppercase
        System.out.println("Uppercase: " + str.toUpperCase());

        // 5. Lowercase
        System.out.println("Lowercase: " + str.toLowerCase());

        // 6. Replace
        System.out.println("Replace: " + str.replace("Java", "World"));

        // 7. Substring
        System.out.println("Substring: " + str.substring(0, 5));

        // 8. Index of
        System.out.println("Index of Java: " + str.indexOf("Java"));

        // 9. Last index of
        System.out.println("Last Index of a: " + str.lastIndexOf("a"));

        // 10. Starts with
        System.out.println("Starts with Hello: " + str.startsWith("Hello"));

        // 11. Ends with
        System.out.println("Ends with Java: " +