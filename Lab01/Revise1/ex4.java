import java.util.Scanner;

public class ex4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        menu();

        System.out.print("Enter your choice: ");
        int userChoice = sc.nextInt();

        switch(userChoice)
        {
            case 0: 
                return;
            case 1:
                Scanner ip1 = new Scanner(System.in);
                System.out.print("Enter Fahrenheit: ");
                double F = sc.nextDouble();
                System.out.println();
                System.out.println("Fahrenheit -> Celsius: " + FtoC(F));
                break;
            case 2: 
                Scanner ip2 = new Scanner(System.in);
                System.out.print("Enter Celsius: ");
                double C = sc.nextDouble();
                System.out.println();
                System.out.println("Celsius -> Fahrenheit: " + CtoF(C));
                break;
            default:
                return;
        }
    }

    public static void menu()
    {
        System.out.println("------------Menu------------");
        System.out.println("0. Exit");
        System.out.println("1. Convert Fahrenheit to Celsius");
        System.out.println("2. Convert Celsius to Fahrenheit");
        System.out.println();
    }

    public static double FtoC(double F)
    {
        return (F - 32) * 5.0/9.0;
    }

    public static double CtoF(double C)
    {
        return C * 9.0/5.0 + 32;
    }
}