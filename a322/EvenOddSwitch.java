AIM:
To write a Java program to check whether a given number is even or odd using a switch statement.

ALGORITHM:
1.Start the program.
2.Import java.util.*.
3.Create a class EvenOddSwitch.
4.Read an integer n from the user.
5.Calculate n % 2.
6.Use a switch statement:
  If the result is 0, display "This number is even".
  If the result is 1, display "This number is odd".
7.Stop the program.

PROGRAM:
import java.util.*;
class EvenOddSwitch
{
public static void main(String args[])
{
int n,i;
Scanner s = new Scanner(System.in);
n = s.nextInt();
switch(n%2)
{
case 0:
System.out.println("this number is  even");
break;
case 1:
System.out.println("This number is odd");
break;
}
}
}

OUTPUT:
Input:
10
Output:
this number is even
RESULT:
Thus, the Java program to check whether a number is even or odd using a switch statement was successfully executed.
