import java.util.Scanner;
import java.lang.Math;

public class phuongtrinhbac2 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a:");
        int a = scanner.nextInt();
        while(a==0){
            System.out.println("Nhap lai: ");
            System.out.println("Nhap a:");
            a = scanner.nextInt();
        }
        System.out.println("Nhap b:");
        int b = scanner.nextInt();
        System.out.println("Nhap c:");
        int c = scanner.nextInt();
        double denta = Math.pow(b, 2) - 4*a*c;
        if(denta<0) System.out.println("Phuong trinh vo nghiem");
        else if (denta == 0) System.out.println("Phuong trinh co nghiem duy nhat: " + (double)(-b/(2*a)));
        else System.out.println("Phuong trinh co 2 nghiem phan biet:\n x1= " + (double)(-b+Math.sqrt(denta))/(2*a) + "\n x2= " + (double)(-b-Math.sqrt(denta))/(2*a));
        scanner.close();
    }
}
