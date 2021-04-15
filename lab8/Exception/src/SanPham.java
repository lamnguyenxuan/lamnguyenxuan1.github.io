import java.util.Scanner;

public class SanPham {
    private int ma;
    private String name;
    private int giaNhap;
    private int giaBan;
    private String moTa;
    private int soLuong;

    public SanPham() {
    }
    public SanPham(int ma, String name, int giaNhap, int giaBan, String moTa, int soLuong) {
        this.ma = ma;
        this.name = name;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.moTa = moTa;
        this.soLuong = soLuong;
    }
    public int getMa() {
        return ma;
    }
    public void setMa(int ma) {
        this.ma = ma;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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
    public String getMoTa() {
        return moTa;
    }
    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
    public int getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    Scanner sc = new Scanner(System.in);
    public void loiNhuan(){
        int loiNhuan = giaBan - giaNhap;
        System.out.println("Loi nhuan la: " + loiNhuan);
    }
    public void input(){
        System.out.println("Nhap ma: ");
        ma = Integer.valueOf(sc.nextLine());
        System.out.println("Nhap ten: ");
        name =sc.nextLine();
        System.out.println("Nhap gia nhap: ");
        giaNhap = Integer.valueOf(sc.nextLine());
        System.out.println("Nhap gia ban: ");
        giaBan = Integer.valueOf(sc.nextLine());
        System.out.println("Nhap mo ta: ");
        moTa = sc.nextLine();
        System.out.println("Nhap so luong: ");
        soLuong = Integer.valueOf(sc.nextLine());
    }
}
