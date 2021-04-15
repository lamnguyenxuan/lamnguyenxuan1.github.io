import java.util.Scanner;

public class SanPham {
    private String maSanPham;
    private String tenSanPham;
    private String moTa;
    private int giaNhap;
    private int giaBan;
    private int soLuongBan;
    private int soLuongTon;

    Scanner sc = new Scanner(System.in);
    public SanPham() {
    }
    
    public SanPham(String maSanPham, String tenSanPham, String moTa, int giaNhap, int giaBan, int soLuongBan,
            int soLuongTon) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.moTa = moTa;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.soLuongBan = soLuongBan;
        this.soLuongTon = soLuongTon;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(int giaNhap) {
        this.giaNhap = giaNhap;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public int getSoLuongBan() {
        return soLuongBan;
    }

    public void setSoLuongBan(int soLuongBan) {
        this.soLuongBan = soLuongBan;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public void input(){
        System.out.println("Nhập mã sản phẩm: ");
        maSanPham = sc.nextLine();
        System.out.println("Nhập tên sản phẩm: ");
        tenSanPham = sc.nextLine();
        System.out.println("Nhập mô tả: ");
        moTa = sc.nextLine();
        System.out.println("Nhập giá nhập: ");
        giaNhap = Integer.valueOf(sc.nextLine());
        System.out.println("Nhập giá bán: ");
        giaBan = Integer.valueOf(sc.nextLine());
        System.out.println("Nhập số lượng bán: ");
        soLuongBan = Integer.valueOf(sc.nextLine());
        System.out.println("Nhập số lượng tồn: ");
        soLuongTon = Integer.valueOf(sc.nextLine());
    }

    public int loiNhuan() {
        return (giaBan - giaNhap) * soLuongBan;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return maSanPham + " - " + tenSanPham +  " - " + moTa + " - " + giaNhap + " - " + soLuongBan + " - " + soLuongTon;
    }
}
