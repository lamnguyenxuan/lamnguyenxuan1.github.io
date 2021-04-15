import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n;
        ArrayList<SanPham> listSP = new ArrayList<SanPham>();
        System.out.println("Nhập số lượng mặt hàng: ");
        try {
            n = Integer.valueOf(sc.nextLine());
            if (n <= 0 || n >= 100)
                System.out.println("Số lượng nhập không hợp lệ");
            else {

                for (int i = 0; i < n; i++) {
                    SanPham sanPham = new SanPham();
                    sanPham.input();
                    listSP.add(sanPham);
                    sanPham.loiNhuan();
                }

                for (int i = 0; i < n; i++) {
                    System.out.printf("Sản phẩm %d: " + listSP.get(i) + "\n", i + 1);
                    System.out.printf("Lợi nhuận của sản phẩm %d: " + listSP.get(i).loiNhuan() + "\n", i + 1);
                }
                // for (int j = 0; j < 3; j++) {
                System.out.println("Nhập lựa chọn: ");
                System.out.println("1: Thêm sản phẩm \n2: Sửa sản phẩm \n3: Xóa sản phẩm");
                int choose = Integer.valueOf(sc.nextLine());
                switch (choose) {
                case 1:
                    SanPham sanPham = new SanPham();
                    System.out.println("Nhập thông tin sản phẩm cần thêm: ");
                    sanPham.input();
                    listSP.add(sanPham);
                    sanPham.loiNhuan();

                    for (int i = 0; i < listSP.size(); i++) {
                        System.out.printf("Sản phẩm %d: " + listSP.get(i) + "\n", i + 1);
                        System.out.printf("Lợi nhuận của sản phẩm %d: " + listSP.get(i).loiNhuan() + "\n", i + 1);
                    }

                    for (int i = 0; i < listSP.size(); i++) {
                        if (listSP.get(i).getSoLuongTon() < 5) {
                            System.out.printf("Mời nhập lại số lượng tồn sản phẩm %d (Lớn hơn 5) : ", i + 1);
                            int fix = Integer.valueOf(sc.nextLine());
                            listSP.get(i).setSoLuongTon(fix);
                            System.out.printf("Sản phẩm %d: " + listSP.get(i) + "\n", i + 1);
                            System.out.printf("Lợi nhuận của sản phẩm %d: " + listSP.get(i).loiNhuan() + "\n", i + 1);
                        }
                    }

                    break;
                case 2:
                    System.out.println("Nhập tên sản phẩm cần sửa: ");
                    String old = sc.nextLine();
                    int dem = 0;
                    for (int i = 0; i < n; i++) {
                        if (listSP.get(i).getTenSanPham().equals(old)) {
                            dem++;
                            System.out.println("Nhập mã sản phẩm: ");
                            String maSanPham = sc.nextLine();
                            System.out.println("Nhập mô tả: ");
                            String moTa = sc.nextLine();
                            System.out.println("Nhập giá nhập: ");
                            int giaNhap = Integer.valueOf(sc.nextLine());
                            System.out.println("Nhập giá bán: ");
                            int giaBan = Integer.valueOf(sc.nextLine());
                            System.out.println("Nhập số lượng bán: ");
                            int soLuongBan = Integer.valueOf(sc.nextLine());
                            System.out.println("Nhập số lượng tồn: ");
                            int soLuongTon = Integer.valueOf(sc.nextLine());
                            listSP.get(i).setMaSanPham(maSanPham);
                            listSP.get(i).setTenSanPham(old);
                            listSP.get(i).setMoTa(moTa);
                            listSP.get(i).setGiaNhap(giaNhap);
                            listSP.get(i).setGiaBan(giaBan);
                            listSP.get(i).setSoLuongBan(soLuongBan);
                            listSP.get(i).setSoLuongTon(soLuongTon);
                        }
                    }
                    if (dem == 0)
                        System.out.println("Tên sản phẩm không tồn tại");
                    else {
                        for (int i = 0; i < listSP.size(); i++) {
                            System.out.printf("Sản phẩm %d: " + listSP.get(i) + "\n", i + 1);
                            System.out.printf("Lợi nhuận của sản phẩm %d: " + listSP.get(i).loiNhuan() + "\n", i + 1);
                        }
                    }

                    for (int i = 0; i < n; i++) {
                        if (listSP.get(i).getSoLuongTon() < 5) {
                            System.out.printf("Mời nhập lại số lượng tồn sản phẩm %d (Lớn hơn 5) : ", i + 1);
                            int fix = Integer.valueOf(sc.nextLine());
                            listSP.get(i).setSoLuongTon(fix);
                            System.out.printf("Sản phẩm %d: " + listSP.get(i) + "\n", i + 1);
                            System.out.printf("Lợi nhuận của sản phẩm %d: " + listSP.get(i).loiNhuan() + "\n", i + 1);
                        }
                    }

                    break;
                case 3:
                    System.out.println("Nhập tên sản phẩm cần xóa: ");
                    String xoa = sc.nextLine();
                    int dem1 = 0;
                    for (int i = 0; i < n; i++) {
                        if (listSP.get(i).getTenSanPham().equals(xoa)) {
                            dem1++;
                            listSP.remove(i);
                        }
                    }

                    if (dem1 == 0)
                        System.out.println("Ten nhap khong hop le");
                    else {
                        for (int i = 0; i < listSP.size(); i++) {
                            System.out.printf("Sản phẩm %d: " + listSP.get(i) + "\n", i + 1);
                            System.out.printf("Lợi nhuận của sản phẩm %d: " + listSP.get(i).loiNhuan() + "\n", i + 1);
                        }

                        for (int i = 0; i < n; i++) {
                            if (listSP.get(i).getSoLuongTon() < 5) {
                                System.out.printf("Mời nhập lại số lượng tồn sản phẩm %d (Lớn hơn 5) : ", i + 1);
                                int fix = Integer.valueOf(sc.nextLine());
                                listSP.get(i).setSoLuongTon(fix);
                                System.out.printf("Sản phẩm %d: " + listSP.get(i) + "\n", i + 1);
                                System.out.printf("Lợi nhuận của sản phẩm %d: " + listSP.get(i).loiNhuan() + "\n",
                                        i + 1);
                            }
                        }
                    }

                }
                // }
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Giá trị nhập không hợp lệ");
        }

        sc.close();
    }
}
