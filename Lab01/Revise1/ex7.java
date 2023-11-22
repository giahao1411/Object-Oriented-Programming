import java.util.Scanner;

public class ex7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        String str = sc.nextLine();
        char ch = str.charAt(0);

        if(isAlphanumeric(ch))
            System.out.println(ch + " is alphanumeric");
        else    
            System.out.println(ch + " is not alphanumeric");
    }

    public static boolean isAlphanumeric(char ch)
    {
        if((ch >= 'A' && ch >= 'Z') || (ch >= '0' && ch <= '9') || (ch >= 'a' && ch >= 'z'))
            return true;
        return false;
    }
}