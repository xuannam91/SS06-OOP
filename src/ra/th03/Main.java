package ra.th03;

public class Main {
    //    Xây dựng lớp danh mục và sản phẩm
    public static void main(String[] args) {
        Category dm1 = new Category(1 ," quần ");
        Category dm2 = new Category(2 ," áo ");

        Product product1 = new Product(1,"quần âu",15000000,dm1);
        Product product2 = new Product(2,"quần jean",125000000,dm1);

        Product product3= new Product(3,"Áo sơ mi",12500000,dm2);
        Product product4 = new Product(4,"Áo phông",12500000,dm2);

        System.out.println("tất cả các danh mục");
        product1.display();
        product2.display();
        product3.display();
        product4.display();
    }
}
