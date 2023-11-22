public class House
{
    private String houseCode;
    private int numOfBedRoom;
    private boolean hasSwimmingPool;
    private double area;
    private double costPerSquareMeter;

    public House()
    {
        this("A01", 2, false, 0.0, 0.0);
    }

    public House(String houseCode, int numOfBedRoom, boolean hasSwimmingPool, double area, double costPerSquareMeter)
    {
        this.houseCode = houseCode;
        this.numOfBedRoom = numOfBedRoom;
        this.hasSwimmingPool = hasSwimmingPool;
        this.area = area;
        this.costPerSquareMeter = costPerSquareMeter;
    }

    //get - set house code
    public String getHouseCode()
    {
       return this.houseCode;
    }
    public void setHouseCode(String houseCode)
    {
        this.houseCode = houseCode;
    }

    //get - set num of bed room
    public int getNumOfBedRoom()
    {
        return this.numOfBedRoom;
    }
    public void setNumOfBedRoom()
    {
        getNumOfBedRoom();
    }

    //get - set has swimming pool
    public boolean getHasSwimmingPool()
    {
        return this.hasSwimmingPool;
    }
    public void setHasSwimmingPool()
    {
        getHasSwimmingPool();
    }

    //get - set area
    public double getArea()
    {
        return this.area;
    }
    public void setArea()
    {
        getArea();
    }

    //get - set cost per square meter
    public double getCostPerSquareMeter()
    {
        return this.costPerSquareMeter;
    }
    public void setCostPerSquareMeter()
    {
        getCostPerSquareMeter();
    }

    public double calculateSellingPrice()
    {
        double SubTotal = this.getArea() * this.getCostPerSquareMeter();
        if(this.hasSwimmingPool)
            SubTotal *= 1.1;
        return SubTotal * 1.15;
    }

    public String toString()
    {
        return "House[" + this.getHouseCode() + ", " + this.getNumOfBedRoom() + ", " + this.getHasSwimmingPool() + ", " + calculateSellingPrice() + "]";
    }
}