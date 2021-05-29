import java.util.Scanner;

public class SanPham {
    private String maSP;
    private String ten;
    private String moTa;
    private int giaNhap;
    private int giaBan;
    private int soLuongTon;
    private int soLuongBan;
    private String hang;
    private DanhMuc danhMuc;

    Scanner sc = new Scanner(System.in);

    public SanPham() {
    }

    public SanPham(String maSP, String ten, String moTa, int giaNhap, int giaBan, int soLuongTon, int soLuongBan,
            String hang, DanhMuc danhMuc) {
        this.maSP = maSP;
        this.ten = ten;
        this.moTa = moTa;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.soLuongTon = soLuongTon;
        this.soLuongBan = soLuongBan;
        this.hang = hang;
        this.danhMuc = danhMuc;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
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

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public int getSoLuongBan() {
        return soLuongBan;
    }

    public void setSoLuongBan(int soLuongBan) {
        this.soLuongBan = soLuongBan;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public DanhMuc getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(DanhMuc danhMuc) {
        this.danhMuc = danhMuc;
    }

    @Override
    public String toString() {
        return "SanPham [danhMuc=" + danhMuc + ", giaBan=" + giaBan + ", giaNhap=" + giaNhap + ", hang=" + hang
                + ", maSP=" + maSP + ", moTa=" + moTa + ", soLuongBan=" + soLuongBan + ", soLuongTon=" + soLuongTon
                + ", ten=" + ten + "]";
    }
    
}
