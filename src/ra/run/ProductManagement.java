package ra.run;
import ra.bussinessImp.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class ProductManagement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Product[] listProduct = new Product[100];
        while (true) {
            System.out.println("****************JAVA-HACKATHON-05-BASIC-MENU***************");
            System.out.println("1. Nhập số sản phẩm và nhập thông tin sản phẩm");
            System.out.println("2. Hiển thị thông tin các sản phẩm");
            System.out.println("3. Sắp xếp sản phẩm theo lợi nhuận tăng dần");
            System.out.println("4. Xóa sản phẩm theo mã sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm theo tên sản phẩm ");
            System.out.println("6. Thay đổi trạng thái của sản phẩm theo mã sản phẩm");
            System.out.println("7. Thoát");

            System.out.println("Hãy nhập lựa chọn từ 1 đến 7: ");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice){
                case 1:createNewProduct(listProduct,input);
                    break;
                case 2:displayListProduct(listProduct);
                    break;
                case 3:sortByInterest(listProduct);
                    break;
                case 4:
                    System.out.println("Nhập vào id muốn xóa");
                    int idDelete = Integer.parseInt(input.nextLine());
                    deleteProduct(listProduct,idDelete);
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Nhập không hợp lệ , vui lòng thử lại !");



            }
        }
    }

    public static void createNewProduct(Product[] list, Scanner sc) {
        Product newStudent = inputData(sc);
        boolean check = false;
        boolean checkNull= false;
        int idMax = 0;
        for (Product st : list) {
            if(st!=null){
                checkNull =true;
                if(idMax<st.getProductId()){
                    idMax = st.getProductId();
                }
            }
        }
        if (checkNull) {
            newStudent.setProductId(idMax+1);
        }
        else {
            newStudent.setProductId(1);
        }
        for (int i = 0; i < list.length; i++) {
            if (list[i] == null) {
                list[i] = newStudent;
                check = true;
                break;
            }
        }
        if (check) {
            System.out.println("thêm mới thành công");
        } else {
            System.err.println("Danh sách sinh viên đã đầy");
        }
    }

            public static Product inputData(Scanner sc) {
                Product sp = new Product();
                System.out.println("Nhập ID cho sản phẩm");
                sp.setProductId(Integer.parseInt(sc.nextLine()));
                System.out.println("nhập vào tên sản phẩm");
                sp.setProductName(sc.nextLine());
                System.out.println("Nhập tiêu đề cho sản phẩm");
                sp.setTitle(sc.nextLine());
                System.out.println("Nhập mô tả cho sản phẩm");
                sp.setDescriptions(sc.nextLine());
                System.out.println("Nhập giá nhập cho sản phẩm");
                sp.setImportPrice(Double.parseDouble(sc.nextLine()));
                System.out.println("Nhập giá suất cho sản phẩm");
                sp.setExportPrice(Double.parseDouble(sc.nextLine()));
                System.out.println(sp);
            return sp;
        }



    public static void displayListProduct(Product[] list) {
        boolean checkNull= false;
        for (Product std : list) {
            if (std != null) {
                checkNull = true;
                System.out.println(std.toString());
            }
        }
        if (!checkNull) {
            System.out.println("Không có sản phẩm nào cả , thêm mới đi !");
        }
        // code
    }
    public static void sortByInterest(Product[] list) {
        for (int i = 0; i < list.length-1 ; i++) {
            for (int j = i+1; j < list.length ; j++) {
                if(list[i]!= null && list[j]!=null){
                    if(list[i].getInterest()> list[j].getInterest()){
                        Product temp = list[i];
                        list[i] = list[j];
                        list[j] = temp;
                    }
                }
            }

        }
        System.out.println("Mảng đã được sắp xếp");
    }

    public static void deleteProduct(Product[] list, int idDelete) {
        boolean check = false;
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null) {
                if (list[i].getProductId() == idDelete) {
                    check = true;
                    list[i] = null;
                }
            }
        }
        if (check) {
            System.out.println("xoá thành công");
        }else {
            System.err.println("Không tồn tại id cần xoá");
        }



   }

}