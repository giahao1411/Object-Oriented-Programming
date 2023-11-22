public class Rectangle
{
    private float width;
    private float length;

    public Rectangle()
    {
        this.width = 1.0f;
        this.length = 1.0f;
    }

    public Rectangle(float width, float length)
    {
        this.width = width;
        this.length = length;
    }

    //get - set width
    public float getWidth()
    {
        return this.width;
    }
    public void setWidth()
    {
        getWidth();
    }

    //get - set length
    public float getLength()
    {
        return this.length;
    }
    public void setLength()
    {
        getLength();
    }

    //get Area
    public float getArea()
    {
        return width * length;
    }

    //get Perimeter
    public float getPerimeter()
    {
        return 2 * (width + length);
    }

    public String toString()
    {
        return "Rectangle[width: " + this.getWidth() + ", length: " + this.getLength() + "]";
    }
}