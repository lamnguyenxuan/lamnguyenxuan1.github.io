public class SanPham {
    private String id1;
    private String ten;
    private String moTa;
    private int giaNhap;
    private int giaBan;
    private int hanSuDung;
    private DanhMuc danhmuc;

    public SanPham() {
    }


    public SanPham(String id, String ten, String moTa, int giaNhap, int giaBan, int hanSuDung, DanhMuc danhmuc) {
        this.id = id;
        this.ten = ten;
        this.moTa = moTa;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.hanSuDung = hanSuDung;
        this.danhmuc = danhmuc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public int getHanSuDung() {
        return hanSuDung;
    }

    public void setHanSuDung(int hanSuDung) {
        this.hanSuDung = hanSuDung;
    }

    public DanhMuc getDanhmuc() {
        return danhmuc;
    }

    public void setDanhmuc(DanhMuc danhmuc) {
        this.danhmuc = danhmuc;
    }

    @Override
    public String toString() {
        return "SanPham [danhmuc=" + danhmuc + ", giaBan=" + giaBan + ", giaNhap=" + giaNhap + ", hanSuDung="
                + hanSuDung + ", id=" + id + ", moTa=" + moTa + ", ten=" + ten + "]";
    }
   
    
}
