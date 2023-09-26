package bttailop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book book1 = new Book();


        do {
            System.out.println("======MENU======\n" +
                     " 1.Nhập thông tin sách \n" +
                    "2.Hiển thị thông tin sách\n" +
                    "3.Tính giá bán sách\n" +
                    "4.Kiểm tra tên sách\n" +
                    "5. Thoát");
            System.out.println("Hãy chọn choice");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    book1.inputData(sc);
                    break;
                case 2:
                    book1.displayData();
                    break;
                case 3:
                    book1.calExportPrice();
                    break;
                case 4:
                    System.out.println("nhập sách cần tìm");
                    String searchBook = sc.nextLine();
                    if(book1.getBookName().equals(searchBook)){
                        System.out.println("sách có tồn tại");
                    }else {
                        System.out.println("Sách không có thật");
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("yêu cầu nhập từ 1-> 5");
                    break;
            }
        }while (true);
    }
}
