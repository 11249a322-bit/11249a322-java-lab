import java.util.Scanner;

public class Fibonacciseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        Fibonacci(n);
    }

    public static void Fibonacci(int n) {
        if (n == 0) {
            System.out.println("0");
        } 
        else if (n == 1) {
            System.out.println("0 1");
        } 
        else {
            System.out.println("0 1");

            int a = 0;
            int b = 1;

            for (int i = 1; i < n - 1; i++) {
                int nextnumber = a + b;
                System.out.print(nextnumber+ " ");

                a = b;
                b = nextnumber;
            }
        }
    }
}
