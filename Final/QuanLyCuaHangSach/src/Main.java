import java.util.Scanner;

public class Main {
    static  ProductRepository productRepository;
    public static void main(String[] args) {
        productRepository = new ProductRepository();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Bạn có muốn tiếp tục chương trình: \nY để tiếp tục \nQ để thoát chương trình");
            System.out.print("Lựa chọn của bạn: ");
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("y")){
                Menu.choose();
                System.out.print("Lựa chọn của bạn: ");
                try {
                int i = Integer.parseInt(sc.nextLine());
                switch (i){
                    case 1:
                        Menu.chooseCategory();
                        System.out.print("Lựa chọn của bạn: ");
                        int chooseCategory = Integer.parseInt(sc.nextLine());
                        getListByCategory(chooseCategory);
                        break;
                    case 2:
                        System.out.print("Nhập tên tác giả bạn muốn tìm kiếm: ");
                        String tacGia = sc.nextLine();
                        productRepository.getProductByAuthor(tacGia);
                        break;
                    case 3:
                        Menu.chooseCategory();
                        System.out.print("Lựa chọn của bạn: ");
                        chooseCategory = sc.nextInt();
                        getListByCategoryAndPrice(chooseCategory);
                        break;
                    case 4:
                        System.out.print("Nhập tên sản phẩm muốn tìm kiếm: ");
                        String name = sc.nextLine();
                        productRepository.searchByName(name);
                        break;
                    case 5:
                        Menu.chooseCategory();
                        System.out.print("Lựa chọn của bạn: ");
                        chooseCategory = sc.nextInt();
                        addProduct(chooseCategory);
                        break;
                    case 6:
                        System.out.print("Nhập tên sản phẩm muốn sửa: ");
                        name = sc.nextLine();
                        productRepository.editProduct(name);
                        break;
                    case 7:
                        System.out.print("Nhập tên sản phẩm muốn xóa: ");
                        name = sc.nextLine();
                        productRepository.deleteProduct(name);
                        break;
                    case 8:
                        System.out.println("Sắp xếp sản phẩm theo giá bán tăng dần: ");
                        productRepository.sortByPrice();
                        break;
                    case 9:
                        System.out.println("Sắp xếp sản phẩm theo tên tăng dần: ");
                        productRepository.sortByName();
                        break;

                    default:
                        System.out.println("Không có lựa chọn này");
                    }
                }catch (Exception e) {
                    System.out.println("Giá trị nhập không hợp lệ\n");
                }
                System.out.println();
                
            }else if(choice.equalsIgnoreCase("q")){
                System.exit(0);
            }
            else{
                System.out.println("Giá trị nhập không hợp lệ\n");
            }
        }
    }

    public static void getListByCategory(int choose){
        switch (choose) {
            case 1:
                productRepository.getProductByCategory(Category.SACHTIENGVIET);
                productRepository.getListByCategory();
                break;
            case 2:
                productRepository.getProductByCategory(Category.SACHTIENGANH);
                productRepository.getListByCategory();
                break;
            case 3:
                productRepository.getProductByCategory(Category.EBOOK);
                productRepository.getListByCategory();
                break;
            default:
                System.out.println("không có lựa chọn này");
        }
    }
    public static void getListByCategoryAndPrice(int choose){
        switch (choose){
            case 1:
                productRepository.getProductByCategory(Category.SACHTIENGVIET);
                productRepository.getProductByCategoryAndPrice(Category.SACHTIENGVIET);
                break;
            case 2:
                productRepository.getProductByCategory(Category.SACHTIENGANH);
                productRepository.getProductByCategoryAndPrice(Category.SACHTIENGANH);
                break;
            case 3:
                productRepository.getProductByCategory(Category.EBOOK);
                productRepository.getProductByCategoryAndPrice(Category.EBOOK);
                break;
            default:
                System.out.println("Không có lựa chọn này");
        }
    }
    public static void addProduct(int choose){
        switch (choose){
            case 1:
                productRepository.addProduct(Category.SACHTIENGVIET);
                break;
            case 2:
                productRepository.addProduct(Category.SACHTIENGANH);
                break;
            case 3:
                productRepository.addProduct(Category.EBOOK);
                break;
            default:
                System.out.println("Không có lựa chọn này");

        }
    }
}
