import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SanPham sp = new SanPham();
        int n=0;
        System.out.println("Nhap so luong: ");
        Scanner sc = new Scanner(System.in);
        try {
        n = Integer.valueOf(sc.nextLine());  
        if(n<0 || n>100){
        System.out.println("So luong khong hop le");
        }       
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("GIa tri khong hop le");
        }
        
        ArrayList<SanPham> arraylist = new ArrayList<SanPham>();
        for(int i=0; i<n; i++){
            sp.input();
            arraylist.add(new SanPham(sp.getMa(), sp.getName(), sp.getGiaNhap(), sp.getGiaBan(), sp.getMoTa(), sp.getSoLuong()));
        }
    }
}
