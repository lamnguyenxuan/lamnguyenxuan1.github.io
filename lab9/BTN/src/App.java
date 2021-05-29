import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<SanPham> listSP = new ArrayList<SanPham>();
        listSP.add(new SanPham("001S", "SAMSUNG GALAXY S20", "DIEN THOAI SAMSUNG", 200000, 1000000, 20, 50, "SAMSUNG",
                DanhMuc.DIENTHOAI));
        listSP.add(new SanPham("002S", "SAMSUNG GALAXY S21", "DIEN THOAI SAMSUNG", 1000000, 3000000, 10, 50, "SAMSUNG",
                DanhMuc.DIENTHOAI));
        listSP.add(new SanPham("003S", "SAMSUNG GALAXY S10", "DIEN THOAI SAMSUNG", 2000000, 5000000, 20, 30, "SAMSUNG",
                DanhMuc.DIENTHOAI));
        listSP.add(new SanPham("004S", "SAMSUNG GALAXY M12", "DIEN THOAI SAMSUNG", 4000000, 8000000, 40, 50, "SAMSUNG",
                DanhMuc.DIENTHOAI));
        listSP.add(new SanPham("005S", "SAMSUNG GALAXY A9", "DIEN THOAI SAMSUNG", 8000000, 15000000, 10, 20, "SAMSUNG",
                DanhMuc.DIENTHOAI));
        listSP.add(new SanPham("001L", "ASUS MX 01", "LAPTOP ASUS", 200000, 1000000, 10, 20, "ASUS", DanhMuc.LAPTOP));
        listSP.add(new SanPham("002L", "DELL MX 02", "LAPTOP DELL", 1000000, 3000000, 10, 20, "ASUS", DanhMuc.LAPTOP));
        listSP.add(new SanPham("003L", "DELL MX 03", "LAPTOP DELL", 2000000, 5000000, 20, 30, "ASUS", DanhMuc.LAPTOP));
        listSP.add(new SanPham("004L", "MSI MX 04", "LAPTOP MSI", 4000000, 9000000, 10, 20, "ASUS", DanhMuc.LAPTOP));
        listSP.add(new SanPham("005L", "ASUS MX 05", "LAPTOP ASUS", 7000000, 15000000, 10, 20, "ASUS", DanhMuc.LAPTOP));
        listSP.add(new SanPham("001A", "APPLE IPHONE X", "DIEN THOAI IPHONE", 500000, 1000000, 30, 50, "IPHONE",
                DanhMuc.APPLE));
        listSP.add(new SanPham("002A", "APPLE IPHONE XS Max", "DIEN THOAI IPHONE", 1100000, 3500000, 35, 60, "IPHONE",
                DanhMuc.APPLE));
        listSP.add(new SanPham("003A", "APPLE IPHONE 7", "DIEN THOAI IPHONE", 3000000, 5500000, 10, 20, "IPHONE",
                DanhMuc.APPLE));
        listSP.add(new SanPham("004A", "APPLE IPHONE 8", "DIEN THOAI IPHONE", 3500000, 8500000, 20, 40, "IPHONE",
                DanhMuc.APPLE));
        listSP.add(new SanPham("005A", "APPLE IPHONE 11", "DIEN THOAI IPHONE", 1000000, 13500000, 30, 70, "IPHONE",
                DanhMuc.APPLE));
        listSP.add(new SanPham("001P", "TAI NGHE 001", "TAI NGHE BLUTOOTH", 100000, 1500000, 30, 70, "MCX",
                DanhMuc.PHUKIEN));
        listSP.add(
                new SanPham("002P", "TAI NGHE 002", "TAI NGHE CO DAY", 1000000, 3500000, 30, 50, "BMW", DanhMuc.PHUKIEN));
        listSP.add(
                new SanPham("003P", "TAI NGHE 003", "TAI NGHE CO DAY", 1500000, 5500000, 20, 70, "BMW", DanhMuc.PHUKIEN));
        listSP.add(
                new SanPham("004P", "TAI NGHE 004", "TAI NGHE CO DAY", 2000000, 7500000, 10, 20, "BMW", DanhMuc.PHUKIEN));
        listSP.add(new SanPham("005P", "TAI NGHE 005", "TAI NGHE BLUTOOTH", 1400000, 16000000, 20, 40, "MCX",
                DanhMuc.PHUKIEN));

        System.out.println("Nhap lua chon: ");
        System.out.println(
                "1: Nhap va in ra thong tin toan bo san pham \n2: In thong tin dua tren danh muc \n3: In thong tin cac san pham dua tren hang \n4: In thong tin cac san pham dua theo gia va danh muc \n5: Nhap vao mot chuoi bat ky va in ra cac san pham co ten tuong tu chuoi do");
        int choose = Integer.valueOf(sc.nextLine());
        switch (choose) {
        case 1:
            for (int i = 0; i < listSP.size(); i++) {
                System.out.println(listSP.get(i).toString());
            }
            break;

        case 2:
            System.out.println("Nhap danh muc: ");
            System.out.println("1: Dien thoai \n2: Laptop \n3: Apple \n4: Phu kien");
            int m = Integer.valueOf(sc.nextLine());
            switch (m) {
                case 1:
                for (int i = 0; i < listSP.size(); i++) {
                    if (listSP.get(i).getDanhMuc().equals(DanhMuc.DIENTHOAI)) {
                        System.out.println(listSP.get(i));
                    }
                }
                break;
                case 2: 
                for (int i = 0; i < listSP.size(); i++) {
                    if (listSP.get(i).getDanhMuc().equals(DanhMuc.LAPTOP)) {
                        System.out.println(listSP.get(i));
                    }
                }
                break;
                case 3:
                for (int i = 0; i < listSP.size(); i++) {
                    if (listSP.get(i).getDanhMuc().equals(DanhMuc.APPLE)) {
                        System.out.println(listSP.get(i));
                    }
                }
                break;
                case 4:
                for (int i = 0; i < listSP.size(); i++) {
                    if (listSP.get(i).getDanhMuc().equals(DanhMuc.PHUKIEN)) {
                        System.out.println(listSP.get(i));
                    }
                }
                break;
                default:
                System.out.println("Khong ton tai");
                break;
            }
            break;
        case 3:
            System.out.println("Nhap hang: ");
            String str = sc.nextLine();
            for (int i = 0; i < listSP.size(); i++) {
                if (listSP.get(i).getHang().toUpperCase().equals(str)) {
                    System.out.println(listSP.get(i));
                }
            }
            break;
        case 4:
            System.out.println("Nhap danh muc: ");
            System.out.println("1: Dien thoai \n2: Laptop \n3: Apple \n4: Phu kien");
            int l = Integer.valueOf(sc.nextLine());
            switch(l){
            case 1:
                System.out.println("Nhap muc gia: ");
                System.out.println(
                        "1: Duoi 2 trieu \n2: Tu 2-4 trieu \n3: Tu 4-7 trieu \n4: Tu 7-13 trieu \n5: Tren 13 trieu");
                int k = Integer.valueOf(sc.nextLine());
                switch(k){
                case 1:
                    for (int i = 0; i < listSP.size(); i++) {
                        if (listSP.get(i).getDanhMuc().equals(DanhMuc.DIENTHOAI)
                                && listSP.get(i).getGiaBan() < 2000000) {
                            System.out.println(listSP.get(i));
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < listSP.size(); i++) {
                        if (listSP.get(i).getDanhMuc().equals(DanhMuc.DIENTHOAI) && listSP.get(i).getGiaBan() >= 2000000
                                && listSP.get(i).getGiaBan() < 4000000)
                            System.out.println(listSP.get(i));
                    }
                    break;
                case 3: 
                    for (int i = 0; i < listSP.size(); i++) {
                        if (listSP.get(i).getDanhMuc().equals(DanhMuc.DIENTHOAI) && listSP.get(i).getGiaBan() >= 4000000
                                && listSP.get(i).getGiaBan() < 7000000)
                            System.out.println(listSP.get(i));
                    }
                    break;
                case 4: 
                    for (int i = 0; i < listSP.size(); i++) {
                        if (listSP.get(i).getDanhMuc().equals(DanhMuc.DIENTHOAI) && listSP.get(i).getGiaBan() >= 7000000
                                && listSP.get(i).getGiaBan() < 13000000)
                            System.out.println(listSP.get(i));
                    }
                    break;
                case 5:
                    for (int i = 0; i < listSP.size(); i++) {
                        if (listSP.get(i).getDanhMuc().equals(DanhMuc.DIENTHOAI)
                                && listSP.get(i).getGiaBan() >= 13000000)
                            System.out.println(listSP.get(i));
                    }
                    break;
                default:
                    System.out.println("Khong ton tai");
                    break;
                }
                break;

            case 2:
                System.out.println("Nhap muc gia: ");
                System.out.println(
                        "1: Duoi 2 trieu \n2: Tu 2-4 trieu \n3: Tu 4-7 trieu \n4: Tu 7-13 trieu \n5: Tren 13 trieu");
                int k2 = Integer.valueOf(sc.nextLine());
                switch(k2){
                case 1:
                    for (int i = 0; i < listSP.size(); i++) {
                        if (listSP.get(i).getDanhMuc().equals(DanhMuc.LAPTOP) && listSP.get(i).getGiaBan() < 2000000) {
                            System.out.println(listSP.get(i));
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < listSP.size(); i++) {
                        if (listSP.get(i).getDanhMuc().equals(DanhMuc.LAPTOP) && listSP.get(i).getGiaBan() >= 2000000
                                && listSP.get(i).getGiaBan() < 4000000)
                            System.out.println(listSP.get(i));
                    }
                    break;
                case 3:
                    for (int i = 0; i < listSP.size(); i++) {
                        if (listSP.get(i).getDanhMuc().equals(DanhMuc.LAPTOP) && listSP.get(i).getGiaBan() >= 4000000
                                && listSP.get(i).getGiaBan() < 7000000)
                            System.out.println(listSP.get(i));
                    }
                    break;
                case 4:
                    for (int i = 0; i < listSP.size(); i++) {
                        if (listSP.get(i).getDanhMuc().equals(DanhMuc.LAPTOP) && listSP.get(i).getGiaBan() >= 7000000
                                && listSP.get(i).getGiaBan() < 13000000)
                            System.out.println(listSP.get(i));
                    }
                    break;
                case 5:
                    for (int i = 0; i < listSP.size(); i++) {
                        if (listSP.get(i).getDanhMuc().equals(DanhMuc.LAPTOP) && listSP.get(i).getGiaBan() >= 13000000)
                            System.out.println(listSP.get(i));
                    }
                    break;
                default:
                    System.out.println("Khong ton tai");
                    break;
            }
            break;

            case 3:
                System.out.println("Nhap muc gia: ");
                 System.out.println(
                        "1: Duoi 2 trieu \n2: Tu 2-4 trieu \n3: Tu 4-7 trieu \n4: Tu 7-13 trieu \n5: Tren 13 trieu");
                int k3 = Integer.valueOf(sc.nextLine());
                switch(k3){
                case 1:
                    for (int i = 0; i < listSP.size(); i++) {
                        if (listSP.get(i).getDanhMuc().equals(DanhMuc.APPLE) && listSP.get(i).getGiaBan() < 2000000) {
                            System.out.println(listSP.get(i));
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < listSP.size(); i++) {
                        if (listSP.get(i).getDanhMuc().equals(DanhMuc.APPLE) && listSP.get(i).getGiaBan() >= 2000000
                                && listSP.get(i).getGiaBan() < 4000000)
                            System.out.println(listSP.get(i));
                    }
                    break;
                case 3: 
                    for (int i = 0; i < listSP.size(); i++) {
                        if (listSP.get(i).getDanhMuc().equals(DanhMuc.APPLE) && listSP.get(i).getGiaBan() >= 4000000
                                && listSP.get(i).getGiaBan() < 7000000)
                            System.out.println(listSP.get(i));
                    }
                    break;
                case 4:
                    for (int i = 0; i < listSP.size(); i++) {
                        if (listSP.get(i).getDanhMuc().equals(DanhMuc.APPLE) && listSP.get(i).getGiaBan() >= 7000000
                                && listSP.get(i).getGiaBan() < 13000000)
                            System.out.println(listSP.get(i));
                    }
                    break;
                case 5:
                    for (int i = 0; i < listSP.size(); i++) {
                        if (listSP.get(i).getDanhMuc().equals(DanhMuc.APPLE) && listSP.get(i).getGiaBan() >= 13000000)
                            System.out.println(listSP.get(i));
                    }
                    break;
                default:
                    System.out.println("Khong ton tai");
                    break;
            }
            break;

            case 4:
                System.out.println("Nhap muc gia: ");
                System.out.println(
                        "1: Duoi 2 trieu \n2: Tu 2-4 trieu \n3: Tu 4-7 trieu \n4: Tu 7-13 trieu \n5: Tren 13 trieu");
                int k4 = Integer.valueOf(sc.nextLine());
                switch(k4){
                case 1:
                    for (int i = 0; i < listSP.size(); i++) {
                        if (listSP.get(i).getDanhMuc().equals(DanhMuc.PHUKIEN) && listSP.get(i).getGiaBan() < 2000000) {
                            System.out.println(listSP.get(i));
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < listSP.size(); i++) {
                        if (listSP.get(i).getDanhMuc().equals(DanhMuc.PHUKIEN) && listSP.get(i).getGiaBan() >= 2000000
                                && listSP.get(i).getGiaBan() < 4000000)
                            System.out.println(listSP.get(i));
                    }
                    break;
                case 3:
                    for (int i = 0; i < listSP.size(); i++) {
                        if (listSP.get(i).getDanhMuc().equals(DanhMuc.PHUKIEN) && listSP.get(i).getGiaBan() >= 4000000
                                && listSP.get(i).getGiaBan() < 7000000)
                            System.out.println(listSP.get(i));
                    }
                    break;
                case 4:
                    for (int i = 0; i < listSP.size(); i++) {
                        if (listSP.get(i).getDanhMuc().equals(DanhMuc.LAPTOP) && listSP.get(i).getGiaBan() >= 7000000
                                && listSP.get(i).getGiaBan() < 13000000)
                            System.out.println(listSP.get(i));
                    }
                    break;
                case 5:
                    for (int i = 0; i < listSP.size(); i++) {
                        if (listSP.get(i).getDanhMuc().equals(DanhMuc.PHUKIEN) && listSP.get(i).getGiaBan() >= 13000000)
                            System.out.println(listSP.get(i));
                    }
                    break;
                default:
                    System.out.println("Khong ton tai");
                    break;
            }
            break;

            default:
                System.out.println("Khong ton tai");
            break;
        }
            case 5:
            int dem = 0;
            System.out.println("Nhap vao mot chuoi bat ky: ");
            String str1 = sc.nextLine();
            for(int i=0; i<listSP.size(); i++){
                if(listSP.get(i).getTen().contains(str1.toUpperCase())){
                    System.out.println(listSP.get(i));
                    dem++;
                }
            }
            if(dem==0) System.out.println("Khong ton tai san pham voi tu khoa tren");
            break;

            default:
            System.out.println("Khong hop le");
        }

        sc.close();
    }
}
