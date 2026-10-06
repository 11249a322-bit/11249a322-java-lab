AIM:
To write a Java program to find the largest among three integers using if-else statements.
  
ALGORITHM:
1.Start the program.
2.Import the Scanner class.
3.Declare three integer variables x, y, and z.
4.Read three integers from the user.
5.Compare x with y and z.
6.If x is greater than both, display "First number is largest."
7.Otherwise, compare y with x and z.
8.If y is greater than both, display "Second number is largest."
9.Otherwise, compare z with x and y.
10.If z is greater than both, display "Third number is largest."
11.If none of the conditions is satisfied, display "The numbers are not distinct."
12.Stop the program.
  
PROGRAM:

import java.util.Scanner;
class LargestOfThreeNumbers
{
public static void main(String args[])
{
int x, y, z;
System.out.println("Enter three integers");
Scanner in = new Scanner(System.in);
x = in.nextInt();
y = in.nextInt();
z = in.nextInt();
if (x > y && x > z)
System.out.println("First number islargest.");
else if (y > x && y > z)
System.out.println("Second number islargest.");
else if (z > x && z > y)
System.out.println("Third number islargest.");
else
System.out.println("The numbers are not distinct.");
}
}

OUTPUT:
Input:
Enter three integers
25
10
15
Output:
First number islargest.
RESULT:
Thus, the Java program to find the largest of three numbers was successfully executed.
