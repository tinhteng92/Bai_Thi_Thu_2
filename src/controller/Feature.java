//package controller;
//
//import io.ReaderAndWriter;
//
//import java.util.Scanner;
//
//public class Feature {
//    Scanner scanner = new Scanner(System.in);
//    ProductManagement productManagement = new ProductManagement();
//    ReaderAndWriter readerAndWriter = new ReaderAndWriter();
//    public void menu(){
//        System.out.println("--- CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM ----");
//        System.out.println("Chọn chức năng theo số(để tiếp tục");
//        System.out.println("1. Xem danh sách sản phẩm");
//        System.out.println("2. Thêm mới");
//        System.out.println("3. Cập nhật");
//        System.out.println("4. Xóa");
//        System.out.println("5. Sắp xếp");
//        System.out.println("6. Tìm sản phẩm có giá đắt nhất");
//        System.out.println("7. Đọc từ file");
//        System.out.println("8. Ghi vào file");
//        System.out.println("9. Thoát");
//        System.out.println("Chọn chức năng: ");
//        int choice = Integer.parseInt(scanner.nextLine());
//        switch (choice){
//            case 1:
//                productManagement.hienThiDS();
//                break;
//            case 2:
//                productManagement.addProduct();
//                break;
//            case 3:
//                productManagement.editProduct();
//                break;
//            case 4:
//                productManagement.deleteProduct();
//                break;
//            case 5:
//                productManagement.sort();
//                break;
//            case 6:
//                productManagement.findMostExpensiveProduct();
//                break;
//            case 7:
//                productManagement.productList = readerAndWriter.read();
//                System.out.println("Đọc thành công");
//                break;
//            case 8:
//                readerAndWriter.write(productManagement.productList);
//                System.out.println("Lưu thành công");
//                break;
//            case 9:
//                System.exit(0);
//        }
//    }
//}
