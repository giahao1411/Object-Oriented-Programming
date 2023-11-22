import java.util.Scanner;

public class ex12
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Reverse number that inputed: " + reverse(n));
    }

    public static int reverse(int n)
    {
        int reverse = 0, rem;
        while(n != 0)
        {
            rem = n % 10;
            reverse = reverse*10 + rem;
            n /= 10;
        }
        return reverse;
    }
}