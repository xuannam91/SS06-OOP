package ra.bt01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Circle circle = new Circle();
    Scanner sc = new Scanner(System.in);
        System.out.println("nhập bán kính");
        double radius = sc.nextDouble();
        circle.setRadius(radius);
        circle.chuvi();
        circle.dientich();
        circle.display();
    }
}
