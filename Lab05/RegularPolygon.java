public class RegularPolygon
{
    private String name;
    private int edgeAmount;
    private double edgeLength;

    public RegularPolygon()
    {
        this.name = "";
        this.edgeAmount = 3;
        this.edgeLength = 1;
    }

    public RegularPolygon(String name, int edgeAmount, double edgeLength)
    {
        this.name = name;
        this.edgeAmount = edgeAmount;
        this.edgeLength = edgeLength;
    }

    public RegularPolygon(String name, int edgeAmount)
    {
        this.name = name;
        this.edgeAmount = edgeAmount;
        this.edgeLength = 1;
    }

    public RegularPolygon(RegularPolygon polygon)
    {
        this.name = polygon.name;
        this.edgeAmount = polygon.edgeAmount;
        this.edgeLength = polygon.edgeLength;
    }

    //get - set name
    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    //get - set edge amount
    public int getedgeAmount()
    {
        return this.edgeAmount;
    }
    public void setedgeAmount(int edgeAmount)
    {
        this.edgeAmount = edgeAmount;
    }

    //get - set edge length
    public double getedgeLength()
    {
        return this.edgeLength;
    }
    public void setedgeLength(double edgeLength)
    {
        this.edgeLength = edgeLength;
    }

    public String getPolygon()
    {
        if(this.edgeAmount == 3)
            return "Triangle";
        else if(this.edgeAmount == 4)
            return "Quadrangle";
        else if(this.edgeAmount == 5)
            return "Pentagon";
        else if(this.edgeAmount == 6)
            return "Hexagon";
        return "Polygon has the numbers of edges greater than 6";
    }

    public double getPerimeter()
    {
        return this.edgeLength * this.edgeAmount;
    }

    public double getArea()
    {
        //edgeLength^2 x a 
        if(this.edgeAmount == 3)
            return this.edgeLength * this.edgeLength * 0.433;
        else if(this.edgeAmount == 4)
            return this.edgeLength * this.edgeLength * 1;
        else if(edgeAmount == 5)
            return this.edgeLength * this.edgeLength * 1.72;
        else if(this.edgeAmount == 6)
            return this.edgeLength * this.edgeLength * 2.595;
        else
            return -1;
    }

    public String toString()
    {
        return this.name + " - " + this.getPolygon() + " - " + this.getArea();
    }
}