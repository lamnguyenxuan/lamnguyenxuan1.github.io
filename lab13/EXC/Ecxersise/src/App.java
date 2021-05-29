import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        File myFile = new File("input.txt");
        Scanner sc = new Scanner(myFile);
        List<Product>list = new ArrayList<>();
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            String str[] = s.split(" - ");
                      
            String id = str[0].trim();
            String name = str[1].trim();
            String describe = str[2].trim();
            Long importPrice = Long.parseLong(str[3].trim());
            long salePrice = Long.parseLong(str[4].trim());
            int amount = Integer.parseInt(str[5].trim());
            int amountSale = Integer.parseInt(str[6].trim());
            String brand = str[7].trim();
            String category = str[8].trim();
            Category c = null;
            if(category.equals("Điện thoại")){
                c = Category.PHONE;
            }
            if(category.equals("Laptop")){
                c = Category.LAPTOP;
            }
            if(category.equals("Apple")){
                c = Category.APPLE;
            }
            if(category.equals("Phụ kiện")){
                c = Category.ACCESSORIES;
            }
            list.add(new Product(id, name, describe, importPrice, salePrice, amount, amountSale, brand, c));
        }
        System.out.println("Danh sách sản phẩm: ");
        list.forEach(System.out::println);

        sc.close();
    }
}
