import java.util.ArrayList;

public class TestPoint <T>
{
    private ArrayList<T> al = new ArrayList<T>();

    public void add(T obj)
    {
        al.add(obj);
    }
    
    public void display()
    {
        for(T obj : al)
        {
            System.out.println(obj);
        }
    }

    public void isInside()
    {
        for(T obj : al)
        {
            if(((Point) obj).getDistance() <= 1.0)
            {
                System.out.println(obj + " - is inside");
            }
            else
            {
                System.out.println(obj + " - is not inside");
            }
        }
    }

    public static void main(String[] args)
    {
        TestPoint<Point> p = new TestPoint<Point>();

        p.add(new Point(1.0, 2.0));
        p.add(new Point(0.5, 0.25));
        p.add(new Point(5.0, 2.0));
        System.out.println("--- Points ---");
        p.display();

        System.out.println();
        System.out.println("Check if points is inside the circle(0,0), radius = 1 or not: ");
        p.isInside();
    }
}