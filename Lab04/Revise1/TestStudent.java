public class TestStudent
{
    public static void main(String[] args)
    {
        Student st1 = new Student(5220080, "Tran", "Hao");
        Student st2 = new Student(7220137, "Tran", "Ngoc");

        System.out.println(st1);
        System.out.println("Name st1 = " + st1.getName());
        System.out.println(st2);
        System.out.println("Name st2 = " + st2.getName());
    }
}