public class TestFraction
{
    public static void main(String[] args)
    {
        Fraction ft1 = new Fraction();
        Fraction ft2 = new Fraction(12, 24);

        System.out.println("Fraction 1 = " + ft1);
        System.out.println("Fraction 2 = " + ft2);
        System.out.println("Cong = " + ft2.add(ft2));
        System.out.println("Tru = " + ft2.sub(ft1));
        System.out.println("Nhan = " + ft1.mul(ft2));
        System.out.println("Chia = " + ft1.div(ft1));
    }
}