AIM:
To write a Java program to search for an element in an array using the Binary Search technique.

ALGORITHM:
1.Start the program.
2.Declare the required variables i, mid, first, last, x, n, and flag.
3.Create a Scanner object to get input from the user.
4.Read the number of elements n.
5.Create an integer array of size n.
6.Read the array elements.
7.Read the element x to be searched.
8.Set first = 0 and last = n - 1.
9.Repeat while first <= last.
10.Calculate the middle position using mid = (first + last) / 2.
11.If a[mid] > x, set last = mid - 1.
12.If a[mid] < x, set first = mid + 1.
13.If a[mid] == x, set flag = 1 and display "element found".
14.If flag == 0, display "element notfound".
15.Stop the program.

PROGRAM:
import java.util.Scanner;
class BinarySearch
{
public static void main(String ar[])
{ int i,mid,first,last,x,n,flag=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of elements:");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter elements of array:");
for(i=0;i<n;++i)
a[i]=sc.nextInt();
System.out.println("Enter element to search:");
x=sc.nextInt();
first=0;
last=n-1;
while(first<=last)
{
mid=(first+last)/2;
if(a[mid]>x)
last=mid-1;
else
if(a[mid]<x)
first=mid+1;
else
{
flag=1;
System.out.println("element found");
break;
}
}
if(flag==0)
System.out.println("element notfound");
}
}

OUTPUT:

Sample Input:

Enter number of elements:
5
Enter elements of array:
10
20
30
40
50
Enter element to search:
30

Output:
element found
  
RESULT:
Thus, the Java program successfully searches for an element in an array using the Binary Search technique.
