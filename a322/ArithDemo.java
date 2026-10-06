AIM:

To write a Java program to demonstrate the use of packages for performing arithmetic operations such as addition, subtraction, multiplication, and division.

ALGORITHM:
1.Start the program.
2.Import the packages add, sub, mul, and div.
3.Create objects for the Add, Sub, Mul, and Div classes.
4.Call the addop() method with values 20 and 10.
5.Call the subop() method with values 20 and 10.
6.Call the mulop() method with values 20 and 10.
7.Call the divop() method with values 20 and 10.
8.Display the results.
9.Stop the program.

PROGRAM:
import java.util.*;
import add.*;
import sub.*;
import mul.*;
import div.*;

public class ArithDemo
{
public static void main(String args[])
{
Add ad = new Add();
Sub su = new Sub();
Mul mu = new Mul();
Div di = new Div();
ad.addop(20,10);
su.subop(20,10);
mu.mulop(20,10);
di.divop(20,10);
}
}

OUTPUT:
Addition: 30
Subtraction: 10
Multiplication: 200
Division: 2

  
RESULT:
Thus, the Java program successfully demonstrates arithmetic operations using user-defined packages.
