package ra.bt05;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Student[] student = new Student[100];
        int count = 0;
        do{
            System.out.println("======MENU======\n" +
                    " 1.Hiển thị danh sách tất cả học sinh \n" +
                    "2.Thêm mới học sinh\n" +
                    "3.Sửa thông tin học sinh dựa vào mã học sinh\n" +
                    "4.Xoá học sinh\n" +
                    "5. Thoát");
            System.out.println("Hãy lựa chọn danh mục thực thi");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    Student.listStudent(count,student);
                    break;
                case 2:
                    Student.addStudent(count, student, sc);
                    count++;
                    break;
                case 3:
                    System.out.println(" Nhập mã sinh viên cần sửa");
                    int updateId = Integer.parseInt(sc.nextLine());
                    Student.updateStudent(count, student, updateId, sc);
                    break;
                case 4:
                    System.out.println("Nhâp vào mã sinh viên cần xoá");
                    int deleteStudentId = Integer.parseInt(sc.nextLine());
                    Student.deleteStudent(count, student, deleteStudentId);
                    count--;
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("yêu cầu nhập từ 1-> 5");
            }

        }while (true);

    }



}
