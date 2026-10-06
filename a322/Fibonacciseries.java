AIM:
To write a Java program to generate the Fibonacci series for n terms.

ALGORITHM:
1.Start the program.
2.Import the Scanner class.
3.Read the value of n from the user.
4.Call the Fibonacci(n) method.
5.If n = 0, print 0.
6.If n = 1, print 0 1.
7.Otherwise, initialize a = 0 and b = 1.
8.Calculate the next term as a + b.
9.Print the next term and update a and b.
10.Repeat until n terms are generated.
11.Stop the program.

PROGRAM:
import java.util.Scanner;

public class Fibonacciseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        Fibonacci(n);
    }

    public static void Fibonacci(int n) {
        if (n == 0) {
            System.out.println("0");
        } 
        else if (n == 1) {
            System.out.println("0 1");
        } 
        else {
            System.out.println("0 1");

            int a = 0;
            int b = 1;

            for (int i = 1; i < n - 1; i++) {
                int nextnumber = a + b;
                System.out.print(nextnumber+ " ");

                a = b;
                b = nextnumber;
            }
        }
    }
}

OUTPUT:
Input:
Enter the value of n: 7
Output:
0 1
1 2 3 5 8
RESULT:
Thus, the Java program to generate the Fibonacci series using a method was successfully execute
