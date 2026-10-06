AIM:
To write a Java program to perform various string operations such as length, concatenation, case conversion, replacement, appending, comparison, prefix, suffix, and index checking.

ALGORITHM:
1.Start the program.
2.Import the Scanner class.
3.Read two strings str1 and str2.
4.Find and display the length of the first string.
5.Concatenate the two strings and display the result.
6.Convert the first string to uppercase and lowercase.
7.Replace the character a with x.
8.Append the second string using StringBuilder.
9.Compare the two strings using equals().
10.Read a prefix and check using startsWith().
11.Read a suffix and check using endsWith().
12.Read a character and find its position using indexOf().
13.Display all the results.
14.Stop the program.

PROGRAM:
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

OUTPUT:

Input:
Enter first string: java
Enter second string: programming
Enter prefix to check: ja
Enter suffix to check: va
Enter character to find: v
Output:
Length of first string: 4
Concatenation: javaprogramming
Uppercase: JAVA
Lowercase: java
Replace 'a' with 'x': jxvx
Append: javaprogramming
Comparison: false
Starts with "ja": true
Ends with "va": true
Index of 'v': 2
    
RESULT:
Thus, the Java program to perform various string operations was successfully executed.
