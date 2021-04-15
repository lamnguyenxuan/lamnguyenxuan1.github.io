import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.lang.Math;
public class SoNguyenTo {
    public static boolean isPrimeNumber(int n) {
        if (n < 2)
            return false;
        else {
            for (int i = 0; i <= Math.sqrt(n); i++) {
                if (n % i == 0)
                    return false;
            }
        }
         return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File myFile = new File("PrimeNumber.txt");
        myFile.createNewFile();
        FileWriter writeFile = new FileWriter(myFile);
        String StrFile = "";

        boolean check = true;
        while(check){
            System.out.println("Nhap gia tri: ");
            String str = sc.nextLine();
            if(str.toUpperCase().equals("X") || str.toUpperCase().equals("Q")){

            }
        }
        // System.out.println("Nhap n: ");
        // String str = sc.nextLine();
        // try {
        //     int n= Integer.valueOf(str);
        //     if(isPrimeNumber(n)){
        //         System.out.println(n + "La so nguyen to");
        //     }
        //     else System.out.println(n + "Khong la so nguyen to");
        // } catch (Exception e) {
        //     //TODO: handle exception
        //     System.out.println("Nhap sai");
        // }
    }
}