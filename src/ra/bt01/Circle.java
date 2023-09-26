package ra.bt01;

public class Circle {
    private double radius;
    private String color;
    private final  double PI = 3.14;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void chuvi(){
        System.out.println(2 * radius * PI);
    }
    public void dientich(){
        System.out.println(radius*radius*PI);
    }
    public void display(){
        System.out.println(
                "bán kính"+ radius +"\n"

        );
    }
}
