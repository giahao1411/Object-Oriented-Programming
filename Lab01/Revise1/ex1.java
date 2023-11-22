import java.util.Scanner;

public class ex1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your date of birth: ");
        String date = sc.nextLine();
        System.out.print("Enter your student ID: ");
        String ID = sc.nextLine();

        System.out.println();
        System.out.println(name);
        System.out.println(date);
        System.out.println(ID);
    }
}