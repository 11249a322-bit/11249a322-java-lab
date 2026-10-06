import java.util.Scanner;

public class Armstorng {
    public static void main(String[] args) {

        int n, nu, num = 0, rem;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        nu = n;

        while (nu != 0) {
            rem = nu % 10;
            num = num + (rem * rem * rem);
            nu = nu / 10;
        }

        if (num == n) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}
