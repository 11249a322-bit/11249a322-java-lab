AIM:
To write a Java program to write characters from A to Z into a text file using FileWriter.
ALGORITHM:
1'Start the program.
2.Import the java.io.* package.
3.Create a FileWriter object for sample2.txt.
4.Use a for loop from character value 65 to 90.
5.Write each character into the file using write().
6.Close the file using close().
7.Handle exceptions using try-catch.
8.Stop the program.

 PROGRAM:
import java.io.*;

class Filewriter {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("sample2.txt");

            for (char i = 65; i < 91; i++) {
                fw.write(i);
            }

            fw.close();
        }
        catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
OUTPUT:
The program does not display anything on the screen.
The contents of sample2.txt will be:
ABCDEFGHIJKLMNOPQRSTUVWXYZ
RESULT:
Thus, the Java program to write characters from A to Z into a file using FileWriter was successfully executed.
