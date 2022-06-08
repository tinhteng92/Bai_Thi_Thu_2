package io;

import model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReaderAndWriter {
    File file = new File("C:\\CodeGym\\Hoc-lieu-Java\\DemoCode\\Modul-2\\Bai_Thi_thu_2\\src\\data\\products.csv");
    public void write(List<Product> productList){
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
            bufferedWriter.write("ID, Name, Price, Quantity, Description");
            bufferedWriter.newLine();
            for(Product p : productList){
                bufferedWriter.write(p.write());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public List<Product> read(){
        List<Product> productList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String str = bufferedReader.readLine();
            while ((str = bufferedReader.readLine()) != null){
                String[] arr = str.split(",");
                int id = Integer.parseInt(arr[0]);
                String name = arr[1];
                Double price = Double.parseDouble(arr[2]);
                int quantity = Integer.parseInt(arr[3]);
                String description = arr[4];

                productList.add(new Product(id, name, price, quantity, description));
            }
            bufferedReader.close();
            fileReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("Chưa tồn tại danh sách sản phẩm");;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return productList;
    }
}
