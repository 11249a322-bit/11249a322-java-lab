AIM:
To write a Java program to find the sum, largest number, and smallest number in a given array.

ALGORITHM:
1.Start the program.
2.Initialize an integer array with the given values.
3.Initialize sum = 0.
4.Set the first array element as both min and max.
5.Traverse the array using a for loop.
6.If the current element is greater than max, update max.
7.If the current element is smaller than min, update min.
8.Add each element to sum.
9.Display the sum, largest number, and smallest number.
10.Stop the program.

PROGRAM:
public class largestsmallest
{
public static void main(String[] args)
{
int a[]=new int[]{23,34,13,64,72,90,10,15,9,27};
int sum = 0;
int min = a[0];
int max = a[0];
for (int i = 1; i<a.length; i++)
{
if (a[i]>max)
{
max =a[i];
}
if (a[i]>min)
{
min = a[i];
}
sum = sum+a[i];
}
System.out.println("the Sum is : "+sum);
System.out.println("largest number in a given array is: "+max);
System.out.println("smallest number in a given array is: "+min);
}
}
OUTPUT:
Given array:
23, 34, 13, 64, 72, 90, 10, 15, 9, 27
Output:
the Sum is : 357
largest number in a given array is: 90
smallest number in a given array is: 9
RESULT:
Thus, the Java program to find the sum, largest, and smallest elements of an array was successfully executed.
