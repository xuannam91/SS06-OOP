package ra.th02;

public class Student {
    int studentId;
    String studentName;
    String className;
    boolean sex;
    int age;
    String address;

    public Student() {
    }

    public Student(int studentId, String studentName, String className, boolean sex, int age, String address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.className = className;
        this.sex = sex;
        this.age = age;
        this.address = address;
    }

    public void display() {
        System.out.println("Mã HS " + studentId + "\n"
                + "tên Hs " + studentName + "\n"
                + "Giới tính " + (sex ? "nam" : "nữ") + "\n"
                + "Lớp" + className + "\n"
                + "địa chỉ " + address
        );
    }

}
