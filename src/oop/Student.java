package oop;

import java.util.Scanner;

public class Student {
//    xây dựng lớp sinh viên gồm:
//    1. Các đặc điểm: mã sinh viên, tên, tuổi, giới tính, địa chỉ, trạng thái.
//    2. gồm 2 contructer: default, tất cả các thông tin
//    3. các phương thức get, set
//    4. Xây dựng các hành vi
//    - chào giảng viên
//    - tính tổng 2 số
//    - nhập thông tin cho sinh viên
//    _ hiển thị thông tin
//    *
//    1 . Attribute / Fields
//    Private Dâttype attributeName
    private String studentId;
    private String studentName;
    private int age;
    private boolean sex;
    private String address;
    private  boolean status;
//    constructors
//    public className(params){Block statements}
//    defalt contructor

    public Student() {
    }

    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public Student(String studentId, String studentName, int age, boolean sex, String address, boolean status) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.status = status;
    }
//    3. các method
//    Access Modifier + returnData + methodNAme (tham số)
//    3.1 Getter? Setter
//    Get: lấy ra dữ liệu thuộc tính
//    Set : gán giá trị cho thuộc tính


    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void hello(){
        System.out.println("Xin chào thầy");
    }
    public int sumTwoNumber(int number1, int number2){
        int sum = number1 + number2;
        return sum;
    }

    public void inputData(Scanner scanner){
        System.out.println("Nhập vào mã sinh viên");
        this.studentId = scanner.nextLine();
        System.out.println("Nhập tên sinh viên");
        this.studentName = scanner.nextLine();
        System.out.println("Nhập vào tuổi");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào giới tính");
        this.sex = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Enter Address:");
        this.address = scanner.nextLine();
        System.out.println("Enter Status:");
        this.status = Boolean.parseBoolean(scanner.nextLine());
    }
    public void displayData() {
        System.out.printf("id: %s - Name: %s - Age: %d ",this.studentId,this.studentName,this.age);
    }
}
