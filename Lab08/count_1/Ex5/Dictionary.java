import java.util.HashMap;
import java.util.Scanner;

public class Dictionary
{
    public static void main(String[] args)
    {
        HashMap<String, String> dictionary = new HashMap<>();

        dictionary.put("dog", "con cho");
        dictionary.put("print", "in");
        dictionary.put("dictionary", "tu dien");
        dictionary.put("hello", "xin chao");
        dictionary.put("attention", "su chu y");
        dictionary.put("animal", "dong vat");
        dictionary.put("key", "chia khoa");
        dictionary.put("apple", "qua tao");
        dictionary.put("private", "rieng tu");
        dictionary.put("circle", "hinh tron");
        dictionary.put("square", "hinh vuong");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word to look up or enter 'close' to exit: ");
        String userEnter = sc.nextLine();
        String word = userEnter.toLowerCase();

        while(!word.equals("close"))
        {
            if(dictionary.containsKey(word))
            {
                System.out.println("Meaning of " + word + " is: " + dictionary.get(word));
            }
            else
            {
                System.out.println("The word " +  word + " is not exist in the dictionary");
            }
            
            System.out.print("Enter another word to look up or enter 'close' to exit: ");
            userEnter = sc.nextLine();
            word = userEnter.toLowerCase();
        }

        sc.close();
    }
}