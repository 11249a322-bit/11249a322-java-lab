AIM:
To write a Java program to read and display the contents of a text file using FileReader.
ALGORITHM:
1.Start the program.
2.Import the java.io.* package.
3.Create a FileReader object for sample2.txt.
4.Read the file character by character using read().
5.Display each character on the screen.
6.Continue until the end of the file is reached.
7.Close the file using close().
8.Handle any exception using try-catch.
9.Stop the program
    
 PROGRAM.:

import java.io.*;

class Filereader {
    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("sample2.txt");
            int i;

            while ((i = fr.read()) != -1) {
                System.out.println((char) i);
            }

            fr.close();
        }
        catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
OUTPUT:
If sample2.txt contains:
Hello Java
File Reading Example
Output:
H
e
l
l
o
 
J
a
v
a

F
i
l
e
 
R
e
a
d
i
n
g
 
E
x
a
m
p
l
e
 RESULT:
Thus, the Java program to read and display the contents of a file using FileReader was successfully executed.
