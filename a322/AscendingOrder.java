AIM:
To write a Java program to arrange the elements of an array in ascending order.

ALGORITHM:
1.Start the program.
2.Declare the variables n and temp.
3.Create a Scanner object to get input from the user.
4.Read the number of elements n.
5.Create an integer array of size n.
6.Read all the elements into the array.
7.Compare each element with the remaining elements using nested for loops.
8.If a[i] > a[j], swap the two elements using the variable temp.
9.Repeat the comparison until all elements are arranged.
10.Display the elements of the array in ascending order.
11.Close the scanner.
12.Stop the program.

PROGRAM:
import java.util.Scanner;
public class AscendingOrder
{
public static void main(String[] args)
{
int n,temp;
Scanner s=new Scanner(System.in);
System.out.print("enter number of elements you want in array:");
n=s.nextInt();
int a[] = new int[n];
System.out.println("enter all the elements:");
for (int i=0; i<n; i++){
a[i] = s.nextInt();
}
for (int i=0; i<n; i++){
for(int j=i+1; j<n; j++){
if (a[i]>a[j]){
temp = a[i];
a[i] = a[j];
a[j] = temp;
}
}
}
System.out.print("Ascending order:");
for(int i=0; i<n-1; i++){
System.out.print(a[i]+",");
}
System.out.print(a[n-1]);
s.close();
}
}

OUTPUT:
enter number of elements you want in array:5
enter all the elements:
50
20
40
10
30
Ascending order:10,20,30,40,50\
  
RESULT:
Thus, the Java program successfully arranges the given array elements in ascending order.


