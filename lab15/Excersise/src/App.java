import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so:");
        long n = Long.valueOf(sc.nextLine());
        int count = 0;
        long digit;
        long temp = n;
        while(n>0){
            n = n/10;
            count++;
            // digit = temp%10;

            // System.out.println("Phan tu thu " + count + " co gia tri la: " + digit);
            // temp = temp/10;
        }

        while(temp > 0){
            digit = temp%10;
            System.out.println("Phan tu thu " + count + " co gia tri la: " + digit);
            temp = temp/10;
            count--;
        }
        
    }
}
