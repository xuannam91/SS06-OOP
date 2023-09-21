package ra.th04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator calculator = new Calculator();


        System.out.println("nhập a");
        double a =input.nextDouble();
        System.out.println("nhập b");
        double b =input.nextDouble();

        calculator.setA(a);
        calculator.setB(b);

        System.out.println("Tổng 2 số là :" + calculator.add());
        System.out.println("hiệu 2 số là :" + calculator.sub());
        System.out.println("tích 2 số là :" + calculator.multi());
        System.out.println("thương 2 số là :" + calculator.div());
    }
}
