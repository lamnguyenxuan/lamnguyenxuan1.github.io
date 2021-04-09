public class KiemChungVIen extends NhanVIen {
    private int soLoi;

    public KiemChungVIen() {
    }

    public KiemChungVIen(int maNhanVien, String hoTen, int tuoi, int soDienThoai, String email, int luongCoBan,
            int soLoi) {
        super(maNhanVien, hoTen, tuoi, soDienThoai, email, luongCoBan);
        this.soLoi = soLoi;
    }

    public int getSoLoi() {
        return soLoi;
    }

    public void setSoLoi(int soLoi) {
        this.soLoi = soLoi;
    }
    
    @Override
    public void Input() {
        // TODO Auto-generated method stub
        super.Input();
        System.out.println("Nhap so loi phat hien duoc: ");
        soLoi = Integer.valueOf(sc.nextLine());
    }
    @Override
    public void TinhLuong() {
        // TODO Auto-generated method stub
        System.out.println("Luong lap trinh vien la: " + (super.getLuongCoBan()+soLoi*50000));
    }
    @Override
    public void Display() {
        // TODO Auto-generated method stub
        super.Display();
        System.out.println("\tSo loi phat hien duoc: " + soLoi);
    }
}
