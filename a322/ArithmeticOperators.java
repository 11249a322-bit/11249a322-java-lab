AIM:
To write a Java program to perform arithmetic operations using a menu-driven program.

ALGORITHM:
1.Start the program.
2.Import the Scanner class.
3.Create a Scanner object to read input.
4.Read two integer numbers x and y.
5.Display the arithmetic operation menu.
6.Read the user's choice.
7.Use a switch statement to perform the selected operation:
 1 → Addition
 2 → Subtraction
 3 → Multiplication
 4 → Division
 5 → Modulus
 6 → Exit
8.Display the calculated result.
9.Repeat the operations until the user selects Exit.
10.Stop the program.

PROGRAM:
import java.util.Scanner;
public class ArithmeticOperators
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
while(true)
{
System.out.println("");
System.out.println("Enter the two numbers to perform operations ");
System.out.print("Enter the first number : ");
int x = s.nextInt();
System.out.print("Enter the second number : ");
int y = s.nextInt();
System.out.println("Choose the operation you want to perform ");
System.out.println("Choose 1 for ADDITION");
System.out.println("Choose 2 for SUBTRACTION");
System.out.println("Choose 3 for MULTIPLICATION");
System.out.println("Choose 4 for DIVISION");
System.out.println("Choose 5 for MODULUS");
System.out.println("Choose 6 for EXIT");
int n = s.nextInt();
switch(n)
{
case 1:
int add = x + y;
System.out.println("Result : "+add);
break;
case 2:
int sub = x - y;
System.out.println("Result : "+sub);
break;
case 3:
int mul = x * y;
System.out.println("Result : "+mul);
break;

case 4:
float div = (float) x / y;
System.out.print("Result : "+div);
break;
case 5:
int mod = x % y;
System.out.println("Result : "+mod);
break;
case 6:
System.exit(0);
}
}
}
}

OUTPUT:
Sample Input:

Enter the two numbers to perform operations
Enter the first number : 20
Enter the second number : 10

Choose the operation you want to perform
Choose 1 for ADDITION
Choose 2 for SUBTRACTION
Choose 3 for MULTIPLICATION
Choose 4 for DIVISION
Choose 5 for MODULUS
Choose 6 for EXIT

1
  1

Output:

Result : 30
  
RESULT:
Thus, the Java program successfully performs addition, subtraction, multiplication, division, and modulus operations using a menu-driven approach.

