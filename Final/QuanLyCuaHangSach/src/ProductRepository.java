import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ProductRepository {
    List<Product> productList;
    List<Product> listByCategory;
    static String MYFILE = "Product.txt";

    public ProductRepository() {
        productList = new ArrayList<>();
        File myFile = new File(MYFILE);

        try {
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                String s = myReader.nextLine();
                String str[] = s.split(" - ");
                String maSach = str[0];
                String tenSach = str[1];
                String tacGia = str[2];
                String theLoai = str[3];
                String nhaXuatBan = str[4];
                int namXuatBan = Integer.parseInt(str[5]);
                int soLuong = Integer.parseInt(str[6]);
                int giaSach = Integer.parseInt(str[7]);
                Category c = null;
                if (str[8].equals("Sách tiếng việt")) {
                    c = Category.SACHTIENGVIET;
                } else if (str[8].equals("Sách tiếng anh")) {
                    c = Category.SACHTIENGANH;
                } else if (str[8].equals("Sách điện tử")) {
                    c = Category.EBOOK;
                }
                productList.add(
                        new Product(maSach, tenSach, tacGia, theLoai, nhaXuatBan, namXuatBan, soLuong, giaSach, c));
            }
           
        } catch (FileNotFoundException e) {
            System.out.println("Không tồn tại File");
        }
        productList.forEach(System.out::println);
        System.out.println();
    }

    public List<Product> getProductByCategory(Category category) {
        listByCategory = new ArrayList<>();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getCategory().equals(category)) {
                listByCategory.add(productList.get(i));
            }
        }
        return listByCategory;
    }

    public void getListByCategory() {
        listByCategory.forEach(System.out::println);
    }

    public void getProductByAuthor(String tacGia) {
        int count = 0;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getTacGia().equalsIgnoreCase(tacGia)) {
                System.out.println(productList.get(i).toString());
                count++;
            }
        }
        System.out.println((count == 0) ? "Không có sách này" : "");
    }

    public void getProductByCategoryAndPrice(Category category) {
        Scanner sc = new Scanner(System.in);
        Menu.choosePrice();
        System.out.println("Lựa chọn của bạn: ");
        int choose = sc.nextInt();
        sc.nextLine();
        int count = 0;
        switch (choose) {
            case 1:
                for (int i = 0; i < listByCategory.size(); i++) {
                    if (listByCategory.get(i).getGiaSach() < 50000) {
                        System.out.println(listByCategory.get(i).toString());
                    }
                }
                break;
            case 2:
                for (int i = 0; i < listByCategory.size(); i++) {
                    if (listByCategory.get(i).getGiaSach() >= 50000 && listByCategory.get(i).getGiaSach() < 100000) {
                        System.out.println(listByCategory.get(i).toString());
                        count++;
                    }
                }
                break;
            case 3:
                for (int i = 0; i < listByCategory.size(); i++) {
                    if (listByCategory.get(i).getGiaSach() >= 100000 && listByCategory.get(i).getGiaSach() < 200000) {
                        System.out.println(listByCategory.get(i).toString());
                        count++;
                    }
                }
                break;
            case 4:
                for (int i = 0; i < listByCategory.size(); i++) {
                    if (listByCategory.get(i).getGiaSach() >= 200000 && listByCategory.get(i).getGiaSach() < 500000) {
                        System.out.println(listByCategory.get(i).toString());
                        count++;
                    }
                }
                break;
            case 5:
                for (int i = 0; i < listByCategory.size(); i++) {
                    if (listByCategory.get(i).getGiaSach() >= 500000) {
                        System.out.println(listByCategory.get(i).toString());
                        count++;
                    }
                }
                break;
        }
       
        System.out.println((count == 0) ? "Không có sách này" : "");
    }

    public void searchByName(String name) {
        int count = 0;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getTenSach().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(productList.get(i).toString());
                count++;
            }
        }
        System.out.println((count == 0) ? "Không có sách này" : "");
    }

    public void addProduct(Category category) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sách: ");
        String maSach = sc.nextLine();
        System.out.println("Nhập tên sách: ");
        String tenSach = sc.nextLine();
        System.out.println("Nhập tên tác giả: ");
        String tacGia = sc.nextLine();
        System.out.println("Nhập thể loại: ");
        String theLoai = sc.nextLine();
        System.out.println("Nhập tên nhà xuất bản: ");
        String nhaXuatBan = sc.nextLine();
        System.out.println("Nhập năm xuất bản: ");
        int namXuatBan = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số lượng: ");
        int soLuong = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập giá sách: ");
        int giaSach = Integer.parseInt(sc.nextLine());
        
        productList
                .add(new Product(maSach, tenSach, tacGia, theLoai, nhaXuatBan, namXuatBan, soLuong, giaSach, category));
        System.out.println("Danh sách sau khi thêm: ");
        productList.forEach(System.out::println);
        writeFile();
    }

    public void editProduct(String tenSachCanSua) {
        int count = 0;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getTenSach().contains(tenSachCanSua)) {
                System.out.println(productList.get(i).toString());
                Scanner sc = new Scanner(System.in);
                System.out.println("Nhập mã sách mới: ");
                String maSach = sc.nextLine();
                productList.get(i).setMaSach(maSach);
                System.out.println("Nhập tên sách mới: ");
                String tenSach = sc.nextLine();
                productList.get(i).setTenSach(tenSach);
                System.out.println("Nhập tên tác giả mới: ");
                String tacGia = sc.nextLine();
                productList.get(i).setTacGia(tacGia);
                System.out.println("Nhập thể loại mới: ");
                String theLoai = sc.nextLine();
                productList.get(i).setTheLoai(theLoai);
                System.out.println("Nhập tên nhà xuất bản mới: ");
                String nhaXuatBan = sc.nextLine();
                productList.get(i).setNhaXuatBan(nhaXuatBan);
                System.out.println("Nhập năm xuất bản mới: ");
                int namXuatBan = Integer.parseInt(sc.nextLine());
                productList.get(i).setNamXuatBan(namXuatBan);
                System.out.println("Nhập số lượng mới: ");
                int soLuong = Integer.parseInt(sc.nextLine());
                productList.get(i).setSoLuong(soLuong);
                System.out.println("Nhập giá sách mới: ");
                int giaSach = Integer.parseInt(sc.nextLine());
                productList.get(i).setGiaSach(giaSach);
                count++;
                System.out.println("sách sau khi sửa là: ");
                System.out.println(productList.get(i).toString());
               
            }
        }
        if (count == 0) {
            System.out.println("Không tìm thấy sách");
        }
        writeFile();
    }

    public void deleteProduct(String name) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getTenSach().contains(name)) {
                System.out.println(productList.get(i).toString());
                productList.remove(productList.get(i));
            }
        }
        System.out.println("Xóa thành công!!!");
        System.out.println("Danh sách  sau khi xóa: ");
        productList.forEach(System.out::println);
        writeFile();
    }
    
    public void sortByPrice(){
        Collections.sort(productList, new Comparator<Product>(){
            @Override
            public int compare(Product p1, Product p2) {
                if(p1.getGiaSach() > p2.getGiaSach()){
                    return 1;
                }
                else{
                    if(p1.getGiaSach() == p2.getGiaSach()){
                        return 0;
                    }
                    else{
                        return -1;
                    }
                }
            }
        });
        System.out.println("Danh sách sản phẩm sau khi sắp xếp theo giá bán tăng dần là: ");
        for(int i=0; i<productList.size(); i++){
            System.out.println(productList.get(i).toString());
        }
    }

    public void sortByName(){
        Collections.sort(productList, new Comparator<Product>(){
            @Override
            public int compare(Product p1, Product p2) {
                return (p1.getTenSach().compareTo(p2.getTenSach()));
            }
        });
        System.out.println("Danh sách sản phẩm sau khi sắp xếp theo giá bán tăng dần là: ");
        for(int i=0; i<productList.size(); i++){
            System.out.println(productList.get(i).toString());
        }
    }

    public void writeFile() {
        try {
            FileWriter filewWriter = new FileWriter(MYFILE);
            for (Product p : productList) {
                filewWriter.write(p.toString() + "\n");
            }
            filewWriter.close();
        } catch (Exception e) {
           System.out.println("Lỗi file");
        }
    }

}
