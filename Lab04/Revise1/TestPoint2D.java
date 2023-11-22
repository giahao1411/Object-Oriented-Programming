public class TestPoint2D
{
    public static void main(String[] args)
    {
        Point2D p1 = new Point2D();
        Point2D p2 = new Point2D(4.4f, 5.7f);

        System.out.println("Point 1 = (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("Point 2 = (" + p2.getX() + ", " + p2.getY() + ")");
    }
}