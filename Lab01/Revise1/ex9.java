import java.util.Scanner;

public class ex9
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        Hailstone(num);
    }

    public static void Hailstone(int num)
    {
        while(num != 1)
        {
            if(num % 2 == 0)
            {
                num /= 2;
                System.out.print(num + " ");
            }
            else
            {
                num = num*3 + 1;
                System.out.print(num + " ");
            }
        }
    }
}