import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        // Length
        System.out.println("\nLength of first string: " + str1.length());

        // Concatenation
        System.out.println("Concatenation: " + str1.concat(str2));

        // Uppercase
        System.out.println("Uppercase: " + str1.toUpperCase());

        // Lowercase
        System.out.println("Lowercase: " + str1.toLowerCase());

        // Replace
        System.out.println("Replace 'a' with 'x': " + str1.replace('a', 'x'));

        // Append
        StringBuilder sb = new StringBuilder(str1);
        sb.append(str2);
        System.out.println("Append: " + sb);

        // Comparison
        System.out.println("Comparison: " + str1.equals(str2));

        // Starts With
        System.out.print("Enter prefix to check: ");
        String prefix = sc.nextLine();
        System.out.println("Starts with \"" + prefix + "\": " + str1.startsWith(prefix));

        // Ends With
        System.out.print("Enter suffix to check: ");
        String suffix = sc.nextLine();
        System.out.println("Ends with \"" + suffix + "\": " + str1.endsWith(suffix));

        // Index Of
        System.out.print("Enter character to find: ");
        char ch = sc.next().charAt(0);
        System.out.println("Index of '" + ch + "': " + str1.indexOf(ch));

        sc.close();
    }
}