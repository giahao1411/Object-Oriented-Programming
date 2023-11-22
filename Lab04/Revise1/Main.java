class Circle {
    private double radius; // bán kính
 
    public Circle(double r) {
       radius = r;
    }
 
    public double getRadius() {
       return radius;
    }
 
    public double getArea() {
       return Math.PI * radius * radius;
    }
 
    public double getCircumference() {
       return 2 * Math.PI * radius;
    }
 }
 
 public class Main {
    public static void main(String[] args) {
       Circle c1 = new Circle(2.5); // tạo một đối tượng hình tròn với bán kính 2.5
       System.out.println("Bán kính của hình tròn là: " + c1.getRadius());
       System.out.println("Diện tích của hình tròn là: " + c1.getArea());
       System.out.println("Chu vi của hình tròn là: " + c1.getCircumference());
    }
 }
 