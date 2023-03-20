package ra.bussinessImp;

import ra.bussiness.IProduct;

import java.util.Scanner;

public class Product implements IProduct {
    private int productId;
    private String productName;
    private String title;
    private String descriptions;
    private double importPrice;
    private double exportPrice;
    private double interest;
    private boolean productStatus;

    public Product() {
        this.productId = productId;
        this.productName = productName;
        this.title = title;
        this.descriptions = descriptions;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.interest = exportPrice - importPrice;
        this.productStatus = productStatus;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public double getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(double importPrice) {
        this.importPrice = importPrice;
    }

    public double getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(double exportPrice) {
        this.exportPrice = exportPrice;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public boolean isProductStatus() {
        return productStatus;
    }

    public void setProductStatus(boolean productStatus) {
        this.productStatus = productStatus;
    }

    @Override
    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id sản phẩm :");
        this.productId = sc.nextInt();
        System.out.println("Nhập tên sản phẩm");
        this.productName = sc.nextLine();
        System.out.println("Nhập tiêu đề sản phẩm");
        this.title = sc.nextLine();
        System.out.println("Nhập mô tả sản phẩm");
        this.descriptions = sc.nextLine();
        System.out.println("Nhập giá nhập sản phẩm");
        this.importPrice = sc.nextFloat();
        System.out.println("Nhập giá suất sản phẩm");
        this.exportPrice = sc.nextFloat();
        this.interest = this.exportPrice - this.importPrice;
    }

    @Override
    public void displayData() {
        System.out.println("ID sản phẩm : " + this.productId);
        System.out.println("Tên sản phẩm : " + this.productName);
        System.out.println("Tiêu đề sản phẩm : " + this.title);
        System.out.println("Mô tả sản phẩm : " + this.descriptions);
        System.out.println("Gía nhập sản phẩm : " + this.importPrice);
        System.out.println("Gía xuất sản phẩm : " + this.exportPrice);
        System.out.println("Lợi nhuận : " + this.interest);
        System.out.println("Trạng thái sản phẩm : " + this.productId);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", title='" + title + '\'' +
                ", descriptions='" + descriptions + '\'' +
                ", importPrice=" + importPrice +
                ", exportPrice=" + exportPrice +
                ", interest=" + interest +
                ", productStatus=" + productStatus +
                '}';
    }
}
