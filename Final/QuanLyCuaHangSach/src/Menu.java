public class Menu {
    public static void choose(){
        System.out.println("1: Hiển thị thông tin dựa trên danh mục");
        System.out.println("2: Hiển thị thông tin dựa theo tên tác giả");
        System.out.println("3: Hiển thị thông tin theo danh mục và mức giá");
        System.out.println("4: Tìm kiếm sản phẩm theo tên");
        System.out.println("5: Thêm sản phẩm");
        System.out.println("6: Sửa thông tin sản phẩm");
        System.out.println("7: Xóa sản phẩm");
        System.out.println("8: Sắp xếp sản phẩm theo giá tăng dần ");
        System.out.println("9: Sắp xếp sản phẩm theo tên tăng dần ");
    }

    public static void chooseCategory(){
        System.out.println("Lựa chọn danh mục: ");
        System.out.println("1: Sách tiếng việt");
        System.out.println("2: Sách tiếng anh");
        System.out.println("3: Ebook");

    }
    public static void choosePrice(){
        System.out.println("Chọn mức giá: ");
        System.out.println("1: Dưới 50.000 VNĐ");
        System.out.println("2: Từ 50.000 VNĐ đến 100.000 VNĐ");
        System.out.println("3: Từ 100.000 VNĐ - 200.000 VNĐ");
        System.out.println("4: Từ 200.000 VNĐ - 500.000 VNĐ");
        System.out.println("5: Trên 500.000 VNĐ");
    }

}
