public class Fraction
{
    private int numerator;          //tu so
    private int denominator;        //mau so

    public Fraction()
    {
        this.numerator = 0;
        this.denominator = 1;
    }

    public Fraction(int num, int den)
    {
        this.numerator = num;
        this.denominator = den;
    }

    public Fraction(Fraction f)
    {
        this.numerator = f.numerator;
        this.denominator = f.denominator;
    }

    public Fraction add(Fraction f)
    {
        int tu_so = (this.numerator * f.denominator) + (this.denominator * f.numerator);
        int mau_so = this.denominator * f.denominator;
        this.reducer();
        return new Fraction(tu_so, mau_so);
    }

    public Fraction sub(Fraction f)
    {
        int tu_so = (this.numerator * f.denominator) - (this.denominator * f.numerator);
        int mau_so = this.denominator * f.denominator;
        this.reducer();
        return new Fraction(tu_so, mau_so);
    }

    public Fraction mul(Fraction f)
    {
        int tu_so = this.numerator * f.numerator;
        int mau_so = this.denominator * f.denominator;
        this.reducer();
        return new Fraction(tu_so, mau_so);
    }   

    public Fraction div(Fraction f)
    {
        int tu_so = this.numerator * f.denominator;
        int mau_so = this.denominator * f.numerator;
        this.reducer();
        return new Fraction(tu_so, mau_so);
    }

    private int findGDC(int a, int b)
    {
        a = Math.abs(a);
        b = Math.abs(b);
        if(a == 0)
            return b;
        if(b == 0)
            return a;
        while(a != b)
        {
            if(a > b)
                a -= b;
            else    
                b -= a;
        }
        return a;
    }

    public void reducer()
    {
        int uc = findGDC(this.numerator, this.denominator);
        this.numerator /= uc;
        this.denominator /= uc;
    }

    public String toString()
    {
        return "Fraction[num = " + this.numerator + ", den = " + this.denominator + "]";
    }
}