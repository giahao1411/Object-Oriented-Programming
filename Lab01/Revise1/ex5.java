import java.util.Scanner;

public class ex5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if(isLeap(year))
            System.out.println(year + " is leap year");
        else    
            System.out.println(year + " is not leap year");
    }

    public static boolean isLeap(int year)
    {
        if(year % 4 == 0 && year % 100 != 0)
            return true;
        else if(year % 400 == 0)
            return true;
        return false;
    }
}