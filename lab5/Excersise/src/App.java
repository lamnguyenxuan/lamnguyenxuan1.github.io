import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       NhanVIen[] nhanVien = new NhanVIen[3];
       for(int i=0;i<3;i++){
           System.out.println("Nhap n: ");
           System.out.println("Neu n = 1 => Lap trinh vien");
           System.out.println("Neu n = 2 => Kiem chung vien");
           int n = sc.nextInt();
           if(n==1){
            nhanVien[i] = new LapTrinhVien();
            nhanVien[i].Input();
            nhanVien[i].Display();
            nhanVien[i].TinhLuong();
           }
           if(n==2){
               nhanVien[i] = new KiemChungVIen();
               nhanVien[i].Input();
               nhanVien[i].Display();
               nhanVien[i].TinhLuong();
           }
       }

       sc.close();
    }
}
