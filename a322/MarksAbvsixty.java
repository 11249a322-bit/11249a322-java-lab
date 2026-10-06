AIM:
To write a Java program to read the names and marks of 6 students and display the students who scored 60 or above.

ALGORITHM:
1.Start the program.
2.Declare an integer array marks to store marks of 6 students.
3.Declare a string array name to store student names.
4.Read the name and marks of each student using a for loop.
5.Store the values in the respective arrays.
6.Traverse the arrays using another for loop.
7.Check whether marks[i] >= 60.
8.If the condition is true, display the student's name and marks.
9.Stop the program.
  
PROGRAM:
import java.util.Scanner;
public class MarksAbvsixty
{
public static void main(String args[])
{
int marks[] = new int[6];
int i;
String name[] = new String[30];
Scanner scanner = new Scanner(System.in);

for(i=0; i<6; i++) {
System.out.print("Enter Name of Student and Marks of Subject"+(i+1)+":");
name[i] = scanner.next();
marks[i] = scanner.nextInt();
}
for(i=0; i<6;i++) {
if(marks[i]>=60)
{
System.out.println(name[i] + " " + marks[i]);
}
}
}
}

OUTPUT:
Input:
Enter Name of Student and Marks of Subject1: Arun 75
Enter Name of Student and Marks of Subject2: Ravi 55
Enter Name of Student and Marks of Subject3: Kumar 82
Enter Name of Student and Marks of Subject4: Priya 48
Enter Name of Student and Marks of Subject5: Anu 65
Enter Name of Student and Marks of Subject6: Vijay 59
Output:
Arun 75
Kumar 82
Anu 65
  
RESULT:
Thus, the Java program to display the students who scored 60 marks or above was
