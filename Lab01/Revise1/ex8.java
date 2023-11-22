import java.util.Scanner;

public class ex8
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        menu();

        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter your choice: ");
        int userChoice = sc.nextInt();

        switch(userChoice)
        {
            case 0:
                return;
            case 1:
                System.out.println("Result = " + S1(n));
                break;
            case 2:
                System.out.println("Result = " + S2(n));
                break;
            case 3:
                System.out.println("Result = " + S3(n));
                break;
            case 4:
                System.out.println("Result = " + S4(n));
                break;
            case 5:
                System.out.println("Result = " + S5(n));
                break;
            default:
                return;
        }
    }

    public static void menu()
    {
        System.out.println("------------Menu------------");
        System.out.println("0. Exit");
        System.out.println("1. Calculate 1 + 2 + 3 +...+ n");
        System.out.println("2. Calculate 1 x 2 x 3 x...x n");
        System.out.println("3. Calculate 1 + 2^1 + 2^2 +...+ 2^n");
        System.out.println("4. Calculate 1/2 + 1/4 + 1/6 +...+ 1/2n");
        System.out.println("5. Calculate 1^2 + 2^2 + 3^2 +...+ n^2");
        System.out.println();
    }

    public static int S1(int n)
    {
        int res = 0;
        for(int i = 1; i <= n; i++)
            res += i;
        return res;
    }

    public static int S2(int n)
    {
        int res = 1;
        for(int i = 1; i <= n; i++)
            res *= i;
        return res;
    }
    
    public static int S3(int n)
    {
        int res = 0;
        for(int i = 0; i <= n; i++)
            res += Math.pow(2, i);
        return res;    
    }

    public static double S4(int n)
    {
        double res = 0;
        for(int i = 1; i <= n; i++)
            res += 1.0/(2.0*i);
        return res;
    }

    public static int S5(int n)
    {
        int res = 0;
        for(int i = 1; i <= n; i++)
            res += Math.pow(i, 2);
        return res;
    }
}