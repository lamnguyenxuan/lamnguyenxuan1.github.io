import java.util.Scanner;

public class NhanVIen{
    private int maNhanVien;
    private String hoTen;
    private int tuoi;
    private int soDienThoai;
    private String email;
    private int luongCoBan;
    public NhanVIen() {
    }
    public NhanVIen(int maNhanVien, String hoTen, int tuoi, int soDienThoai, String email, int luongCoBan) {
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.luongCoBan = luongCoBan;
    }
    public int getMaNhanVien() {
        return maNhanVien;
    }
    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public int getTuoi() {
        return tuoi;
    }
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    public int getSoDienThoai() {
        return soDienThoai;
    }
    public void setSoDienThoai(int soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getLuongCoBan() {
        return luongCoBan;
    }
    public void setLuongCoBan(int luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    Scanner sc = new Scanner(System.in);
    public void Input(){
        System.out.println("Nhap ma nhan vien: ");
        maNhanVien = Integer.valueOf(sc.nextLine());
        System.out.println("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        tuoi = Integer.valueOf(sc.nextLine());
        System.out.println("Nhap so dien thoai: ");
        soDienThoai = Integer.valueOf(sc.nextLine());
        System.out.println("Nhap email: ");
        email = sc.nextLine();
        System.out.println("Nhap luong co ban: ");
        luongCoBan = Integer.valueOf(sc.nextLine());
    }
    public void TinhLuong(){

    }

    public void Display(){
        System.out.print("Ma nhan vien: " + maNhanVien + "\tho ten: " + hoTen + "\ttuoi: " + tuoi + "\tso dien thoai: " + soDienThoai + "\temail: " + email + "\tluong co ban: " + luongCoBan);
    }
}