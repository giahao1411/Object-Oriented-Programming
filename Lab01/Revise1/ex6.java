import java.util.Scanner;

public class ex6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num 1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter num 2: ");
        int n2 = sc.nextInt();
        System.out.print("Enter num 2: ");
        int n3 = sc.nextInt();

        System.out.println("The greatest number between " + n1 +", " + n2 + ", " + n3 + " is: " + findMax(n1, n2, n3));
    }

    public static int findMax(int n1, int n2, int n3)
    {
        int max = n1;
        if(n2 > max)
            max = n2;
        else
            max = n3;
        return max;
    }
}