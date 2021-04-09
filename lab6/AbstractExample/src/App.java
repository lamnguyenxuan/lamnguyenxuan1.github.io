import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // Circle c = new Circle();
        // System.out.println("Nhap ban kinh hinh tron: ");
        // c.setBanKinh() = sc.nextDouble();
        Square s = new Square();
        System.out.println("Nhap canh hinh vuong: ");
        double x = sc.nextDouble();
        s.setCanh(x);
        s.tinhDienTich();
        sc.close();
    }
}
