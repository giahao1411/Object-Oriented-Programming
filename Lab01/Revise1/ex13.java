import java.util.Scanner;

public class ex13
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if(isPalindrome(n))
            System.out.println(n +" is palindrome");
        else
            System.out.println(n + " is not palindrome");
    }

    public static boolean isPalindrome(int n)
    {
        int temp = n;
        int check = 0, rem;
        while(temp != 0)
        {
            rem = temp % 10;
            check = check*10 + rem;
            temp /= 10;
        }
        if(check == n)
            return true;
        return false;
    }
}