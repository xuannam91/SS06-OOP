package ra.bt02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Phương trình bậc hai ax2+bx+c=0
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập a");
        double a =sc.nextDouble();
        System.out.println("nhập b");
        double b =sc.nextDouble();
        System.out.println("nhập c");
        double c =sc.nextDouble();

        quadraticEquation.setA(a);
        quadraticEquation.setB(b);
        quadraticEquation.setC(c);

        System.out.println(quadraticEquation.resultQuadraticEquation());
    }
}
