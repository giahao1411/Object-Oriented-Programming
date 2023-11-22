import java.util.Scanner;

public class ex11
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Count number of digit in a number: " + count(n));
    }

    public static int count(int n)
    {
        int count = 0;
        while(n != 0)
        {
            count++;
            n /= 10;
        }
        return count;
    }
}