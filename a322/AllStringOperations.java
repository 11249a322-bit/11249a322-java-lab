AIM:
To write a Java program to demonstrate various String operations such as length, character access, concatenation, case conversion, replacement, substring, searching, and checking start/end characters.

ALGORITHM:
1.Start the program.
2.Create two String variables str and str2.
3.Find and display the length of str.
4.Display the character at index 1 using charAt().
5.Concatenate another string using concat().
6.Convert the string to uppercase using toUpperCase().
7.Convert the string to lowercase using toLowerCase().
8.Replace "Java" with "World" using replace().
9.Extract a substring using substring().
10.Find the position of "Java" using indexOf().
11.Find the last occurrence of "a" using lastIndexOf().
12.Check whether the string starts with "Hello" using startsWith().
13.Check whether the string ends with "Java" using endsWith().
14.Display all results.
15.Stop the program.
    PROGRAM:
    public static void main(String[] args) {

        String str = "Hello Java";
        String str2 = "Hello World";
        System.out.println("Length: " + str.length());
        System.out.println("Character at index 1: " + str.charAt(1));
        System.out.println("Concatenation: " + str.concat(" Programming"));
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase())
        System.out.println("Replace: " + str.replace("Java", "World"));
        System.out.println("Substring: " + str.substring(0, 5));
        System.out.println("Index of Java: " + str.indexOf("Java"));
        System.out.println("Last Index of a: " + str.lastIndexOf("a"));
        System.out.println("Starts with Hello: " + str.startsWith("Hello"));
        System.out.println("Ends with Java: " +

                    
OUTPUT:
For str = "Hello Java":

Length: 10
Character at index 1: e
Concatenation: Hello Java Programming
Uppercase: HELLO JAVA
Lowercase: hello java
Replace: Hello World
Substring: Hello
Index of Java: 6
Last Index of a: 9
Starts with Hello: true
Ends with Java: true
    
RESULT:
Thus, the Java program successfully demonstrates various String operations and produces the expected output.
