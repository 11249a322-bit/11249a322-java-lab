AIM:
To write a Java program to check whether a given year is a leap year or not.

ALGORITHM:
Start the program.
1.Import the Scanner class.
2.Read the year from the user.
3.Check if the year is divisible by 400.
4.If yes, it is a leap year.
5.Otherwise, check if the year is divisible by 100.
6.If yes, it is not a leap year.
7.Otherwise, check if the year is divisible by 4.
8.If yes, it is a leap year; otherwise, it is not a leap year.
9.Display the result.
10.Stop the program.

PROGRAM:
import java.util.Scanner;
public class LeapYear
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
System.out.print("Enter any year:");
int year = s.nextInt();
boolean flag = false;
if(year % 400 == 0)
{
flag = true;
}
else if (year % 100 == 0)
{
flag = false;
}
else if(year % 4 == 0)
{
flag = true;
}
else
{
flag = false;
}
if(flag)
{
System.out.println("Year "+year+" is a Leap Year");
}
else
{
System.out.println("Year "+year+" is not a Leap Year");
}
}
}

OUTPUT:
Input:
Enter any year: 2024
Output:
Year 2024 is a Leap Year
RESULT:
Thus, the Java program to check whether the given year is a leap year or not was successfully executed.
