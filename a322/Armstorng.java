AIM:
To write a Java program to check whether a given number is an Armstrong number or not.

ALGORITHM:
1.Start the program.
2.Declare the variables n, nu, num, and rem.
3.Create a Scanner object to get input from the user.
4.Read the number n.
5.Store the original number in nu.
6.Initialize num = 0.
7.Repeat the following steps while nu != 0:
 Find the remainder using rem = nu % 10.
 Calculate the cube of the remainder.
 Add the cube to num.
 Remove the last digit using nu = nu / 10.
8.Compare num with the original number n.
9.If num == n, display "Armstrong Number".
10.Otherwise, display "Not an Armstrong Number".
11.Stop the program.
    
PROGRAM:
import java.util.Scanner;

public class Armstorng {
    public static void main(String[] args) {

        int n, nu, num = 0, rem;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        nu = n;

        while (nu != 0) {
            rem = nu % 10;
            num = num + (rem * rem * rem);
            nu = nu / 10;
        }

        if (num == n) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}
OUTPUT:
Enter a number: 153
Armstrong Number
    
RESULT:
Thus, the Java program successfully checks whether the given number is an Armstrong number or not.
