package ra.th02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//         Xây dựng lớp học sinh
        Student student = new Student(1, "Đào xuan Nam", "Jv01", true, 19, "Hà Nội");
        Student student2 = new Student(2, "Tâm Tâm", "Jv01", true, 19, "Hà Nam");
        Student student3 = new Student(3, "Minh Minh", "Jv01", true, 19, "hà nội");

        System.out.println("-----------------Thông tin của Student----------------");
        student.display();
        System.out.println("-----------------Thông tin của Student2----------------");
        student2.display();
        System.out.println("-----------------Thông tin của Student3----------------");
        student3.display();
    }
}
