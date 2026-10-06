
Aim:
To write a Java program to calculate the area and perimeter of a square, circle, and triangle using classes and objects.

Algorithm:
1.Start the program.
2.Import the Scanner class for user input.
3.Read the side of the square.
4.Create a Square object and calculate its area and perimeter.
5.Read the radius of the circle.
6.Create a Circle object and calculate its area and perimeter.
7.Read the three sides of the triangle.
8.Create a Triangle object and calculate its area and perimeter.
9.Display all calculated values
10.stop the program

PROGRAM:
    import java.util.*;
class Calculate
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Square
        System.out.println("Enter The side of the Square : ");
        int s = sc.nextInt();

        Square sq = new Square(s);

        System.out.println("Perimeter of Square is " + sq.perimeter());
        System.out.println("Area of Square is " + sq.area());

        // Circle
        System.out.println("Enter The radius of the Circle : ");
        int r = sc.nextInt();

        Circle ci = new Circle(r);

        System.out.println("Perimeter of Circle is " + ci.perimeter());
        System.out.println("Area of Circle is " + ci.area());

        // Triangle
        System.out.println("Enter The Side1 of the Triangle : ");
        int s1 = sc.nextInt();

        System.out.println("Enter The Side2 of the Triangle : ");
        int s2 = sc.nextInt();

        System.out.println("Enter The Side3 of the Triangle : ");
        int s3 = sc.nextInt();

        Triangle t = new Triangle(s1, s2, s3);

        System.out.println("Perimeter of Triangle is " + t.perimeter());
        System.out.println("Area of Triangle is " + t.area());

        sc.close();
    }
}
OUTPUT:
Enter The side of the Square :
5
Perimeter of Square is 20
Area of Square is 25

Enter The radius of the Circle :
7
Perimeter of Circle is 43.98
Area of Circle is 153.86

Enter The Side1 of the Triangle :
3
Enter The Side2 of the Triangle :
4
Enter The Side3 of the Triangle :
5
Perimeter of Triangle is 12
Area of Triangle is 6
    
Result:
Thus, the Java program to calculate the area and perimeter of square, circle, and triangle was successfully executed and the results were obtained.
