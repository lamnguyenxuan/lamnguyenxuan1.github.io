public class LapTrinhVien extends NhanVIen {
    private int soGioLamThem;

    public LapTrinhVien() {
    }

    public LapTrinhVien(int maNhanVien, String hoTen, int tuoi, int soDienThoai, String email, int luongCoBan,
            int soGioLamThem) {
        super(maNhanVien, hoTen, tuoi, soDienThoai, email, luongCoBan);
        this.soGioLamThem = soGioLamThem;
    }

    public int getSoGioLamThem() {
        return soGioLamThem;
    }

    public void setSoGioLamThem(int soGioLamThem) {
        this.soGioLamThem = soGioLamThem;
    }

    @Override
    public void Input() {
        // TODO Auto-generated method stub
        super.Input();
        System.out.println("Nhap so gio lam them: ");
        soGioLamThem = Integer.valueOf(sc.nextLine());
    }

    @Override
    public void TinhLuong() {
        // TODO Auto-generated method stub
        System.out.println("Luong lap trinh vien la: " + (super.getLuongCoBan()+soGioLamThem*200000));
    }

    @Override
    public void Display() {
        // TODO Auto-generated method stub
        super.Display();
        System.out.println("\tso gio lam them: " + soGioLamThem);
    }
}