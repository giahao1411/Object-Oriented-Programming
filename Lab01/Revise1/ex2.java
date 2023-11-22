import java.util.Scanner;

public class ex2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter height: ");
        double h = sc.nextDouble();
        System.out.print("Enter base: ");
        double b = sc.nextDouble();

        double area = 1.0/2.0 * b * h;

        System.out.print("Triangle area = " + area);
    }
}