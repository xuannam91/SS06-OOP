package ra.bt06;

import java.util.Scanner;

public class Employee {
    private int employeeId;
    private String employeeName;
    private int age;
    private boolean sex;
    private double rate;
    private double salary;

    public Employee() {
    }

    public Employee(int employeeId, String employeeName, int age, boolean sex, double rate, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.sex = sex;
        this.rate = rate;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
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

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void  inputData(Scanner scanner){
        System.out.println("Nhập mã nhân viên");
        this.employeeId = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên nhân viên");
        this.employeeName = scanner.nextLine();
        System.out.println("Nhập tuổi");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào giới tính");
        this.sex = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập hệ số lương:");
        this.rate = Double.parseDouble(scanner.nextLine());
    }
    public void displayData(){
        System.out.printf("employeeId: %d - employeeName: %s - age: %d \n ",this.employeeId,this.employeeName,this.age);
        System.out.printf("sex: %b - rate: %f - salary: %f \n", this.sex, this.rate, this.salary);
    }
    public void calSalary(){
        this.salary =  rate * 1.300000;
    }
}
