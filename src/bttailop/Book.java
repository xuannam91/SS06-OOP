package bttailop;

import java.util.Scanner;

public class Book {

//    Xây dựng lớp Book trong ra.entity gồm các thông tin sau:
//    Thuộc tính
//    bookId - int
//    bookName - String
//    importPrice - float
//    exportPrice - float
//    author - String
//    status - boolean
//    Các constructor: default - Khởi tạo tất cả thông tin sách
//    Các phương thức getter/setter
//    Các phương thức:
//    inputData(Scanner scanner): nhập thông tin sách (trừ exportPrice)
//    displayData(): hiển thị tất cả thông tin đối tượng
//    calExportPrice(): tính exportPrice theo công thức:
//    exportPrice = importPrice * 1.2
//    Xây dựng lớp BookImp trong ra.impl thực hiện khởi tạo đối tượng Book và
//    hiển thị menu và thực hiện các chức năng theo menu:
//            **MENU**
//    Nhập thông tin sách
//    Hiển thị thông tin sách
//    Tính giá bán sách
//    Kiểm tra tên sách
//    Thoát
//*/

    private int  bookId;
    private String bookName;
    private float importPrice;
    private float exportPrice;
    private String author;
    private  boolean status;

    public Book() {
    }

    public Book(int bookId, String bookName, float importPrice, float exportPrice, String author, boolean status) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.author = author;
        this.status = status;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void inputData(Scanner scanner){
        System.out.println("Nhập vào mã book");
        this.bookId = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên book");
        this.bookName = scanner.nextLine();
        System.out.println("Nhập vào giá");
        this.importPrice = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập vào tác giả");
        this.author = scanner.nextLine();
        System.out.println("Enter Status:");
        this.status = Boolean.parseBoolean(scanner.nextLine());
    }
    public void calExportPrice(){
        this.exportPrice = (float) (importPrice * 1.2);
    }
    public void displayData(){
        System.out.printf("bookId: %d - bookName: %s - importPrice: %f \n ",this.bookId,this.bookName,this.importPrice);
        System.out.printf("Giá bán: %f - author: %s - status: %b \n", this.exportPrice, this.author, (this.status?"còn hàng":"hết hàng"));
    }

}