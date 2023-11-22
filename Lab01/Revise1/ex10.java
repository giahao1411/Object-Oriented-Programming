import java.util.Scanner;

public class ex10
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Sum of the first digit and the last digit = " + sum(n));
    }

    public static int sum(int n)
    {
        int lastDigit = n % 10;
        int firstDigit = n;
        while(firstDigit >= 10)
            firstDigit /= 10;
        return firstDigit + lastDigit;
    }
}