public class TestHouse
{
    public static void main(String[] args)
    {
        House h1 = new House();
        House h2 = new House("A001", 5, true, 100, 2500000);

        System.out.println(h1);
        System.out.println(h2);
    }
}