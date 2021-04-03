import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = scanner.nextInt();
        int [][]a = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println("Nhap phan tu thu " + i + j);
                a[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Mang da nhap la: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
          int sum=0;
         
        System.out.println("So phan tu nam tren duong cheo la: ");
         for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==j){
                System.out.print(a[i][j] + " ");
                sum+= a[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("Tong phan tu nam tren duong cheo la: " + sum);
    }
}
