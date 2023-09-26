package ra.bt06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee nv1 = new Employee();
        Employee nv2 = new Employee();

        System.out.println("Nhập thông tin nhân viên 1");
        nv1.inputData(sc);
        nv1.calSalary();
        System.out.println("Hiển thị nhân viên 1");
        nv1.displayData();

        System.out.println("Nhập thông tin nhân viên 2");
        nv2.inputData(sc);
        nv2.calSalary();
        System.out.println("Hiển thị nhân viên 2");
        nv2.displayData();

    }
}
