package ra.bt05;

import java.util.Scanner;

public class Student {
    int studentId;
    String studentName;
    int age;
    boolean sex;
    String address;
    String phone;

    public Student() {
    }

    public Student(int studentId, String studentName, int age, boolean sex, String address, String phone) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.phone = phone;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public static Student inputData(Scanner scanner){
        Student student = new Student();
        System.out.println("Nhập vaò mã sinh viên");
        student.studentId = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vaò tên sinh viên");
        student.studentName = scanner.nextLine();
        System.out.println("Nhập vaò tuổi");
        student.age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vaò giới tính");
        student.sex = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập vào địa chỉ");
        student.address = scanner.nextLine();
        System.out.println("nhập vào số điện thoại");
        student.phone = scanner.nextLine();

        return student;
    }
    public void displayData(){
        System.out.printf("Mã Id: %d - Tên học viên: %s - Tuổi: %d \n" ,this.studentId, this.studentName, this.age);
        System.out.printf("Giới tính: %b - Địa chỉ: %s - Sdt: %s \n" ,this.sex, this.address, this.phone);
    }
    public static void listStudent(int count, Student[] student){
        if(count == 0){
            System.out.println("Danh sách trống");
        }else {
            for (int i = 0; i < count; i++) {
                student[i].displayData();
            }
        }
    }
    public static void addStudent(int count, Student[] student, Scanner sc){
        if(count < 100){
            student[count] = inputData(sc);
        }else {
            System.out.println("danh sách đã đủ 100 người, không thể thêm được nữa");
        }

    }

    public static  void updateStudent(int count, Student[] student, int updateId, Scanner sc){
        boolean check = false;
        int index = -1;
        for (int i = 0; i < count; i++) {
            if(student[i].studentId == updateId){
                check = true;
                index = i;
                break;
            }
        }
        if(!check){
            System.out.println("Mã học viên không tìm thấy");
        }else {
            System.out.println("Nhập thông tin cần sửa đôỉ");
            System.out.println("Nhập tên mới");
            String newName = sc.nextLine();
            student[index].setStudentName(newName);
            System.out.println("Nhập tuổi mới");
            int newAge = Integer.parseInt(sc.nextLine());
            student[index].setAge(newAge);
            System.out.println("Nhập giới tính lại");
            boolean newSex = Boolean.parseBoolean(sc.nextLine());
            student[index].setSex(newSex);
            System.out.println("Nhập địa chỉ mới");
            String newAddress = sc.nextLine();
            student[index].setAddress(newAddress);
            System.out.println("Nhập số điện thoại mới");
            String newPhone = sc.nextLine();
            student[index].setPhone(newPhone);

        }
    }
    public static void deleteStudent(int count, Student[] student, int deleteStudentId){
        int index = -1;
        for (int i = 0; i < count; i++) {
            if(student[i].studentId == deleteStudentId){
                index = i;
                break;
            }
        }
        if(index == -1 ){
            System.out.println("Mã học viên không tìm thấy");
        }else {
            for (int i = 0; i < count; i++) {
                for (int j = index; j < count - 1; j++) {
                    student[j] = student[j + 1];
                }
            }

        }

    }


}
