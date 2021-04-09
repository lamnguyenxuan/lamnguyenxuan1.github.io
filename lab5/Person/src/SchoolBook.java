import java.util.Scanner;

public class SchoolBook extends Library {
    
    private int soTrang;
    private String tinhTrang;
    private int soLMuon;
    
    public SchoolBook() {
    }

   public SchoolBook(String ms, String name, String nxb, int year, int amount, Scanner sc, int soTrang, String tinhTrang, int soLMuon) {
    super(ms, name, nxb, year, amount, sc);
    this.soTrang = soTrang;
    this.tinhTrang = tinhTrang;
    this.soLMuon = soLMuon;
    }
    
    @Override
    public void input() {
        // TODO Auto-generated method stub
        super.input();
        System.out.println("Nhap so trang: ");
        soTrang = Integer.valueOf(sc.nextLine());
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public int getSoLMuon() {
        return soLMuon;
    }

    public void setSoLMuon(int soLMuon) {
        this.soLMuon = soLMuon;
    }   
}
