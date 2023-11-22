public class TestRectangle
{
    public static void main(String[] args)
    {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(3.4f, 9.2f);

        System.out.println("Rec1 Area = " + r1.getArea() + ", Rec1 Perimeter = " + r1.getPerimeter());
        System.out.println("Rectangle 1: " +  r1);
        System.out.println("Rec2 Area = " + r2.getArea() + ", Rec2 Perimeter = " + r2.getPerimeter());
        System.out.println("Rectangle 2: " + r2);
    }
}