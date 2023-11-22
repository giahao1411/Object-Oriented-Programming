import java.util.Scanner;

public class ex3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter num2: ");
        int n2 = sc.nextInt();

        System.out.println("Remainder of " + n1 + " and " + n2 + " = " + remainderOfADivision(n1, n2));
    }

    public static int remainderOfADivision(int n1, int n2)
    {
        return n1 % n2;
    }
}