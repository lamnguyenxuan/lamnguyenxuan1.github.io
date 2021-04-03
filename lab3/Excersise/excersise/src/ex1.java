import java.util.Scanner;

public class ex1{
      public static boolean isPrimeNumber(int n) {
        if (n < 2)  return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int insert(int []a, int n, int size, int k, int x){
        if(n>=size) return n;
        else{
            for(int i=k;i<n;i++){
                a[i+1] = a[i];
            }
            a[k] = x;
            return n+1;
        }
    }

    public static void show(int n, int []a){
        for(int i=0; i<n; i++){
            System.out.print(a[i] +" ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhap tu ban phim n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []a = new int[n+1];
        for(int i=0; i<n; i++){
            System.out.printf("Nhap phan tu thu %d: ", i);
            a[i] = scanner.nextInt();
        }
        int max = 0;
        int min = 0;
        for(int i=0; i<n; i++){
            if(a[i]<min) min = a[i];
        }
        System.out.println("Phan tu nho nhat la: " + min); 

         for(int i=0; i<n; i++){
            if(a[i]>max) max = a[i];
        }
         System.out.println("Phan tu lon nhat la: " + max); 
         System.out.print("Cac phan tu la so nguyen to la: ");
        for(int i=0;i<n;i++){
            if(isPrimeNumber(a[i])) System.out.print(a[i] +" ");
        }
        System.out.println();
        System.out.println("Cac phan tu trong mang la: ");
        show(n, a);
        System.out.println();
        //Them phan tu
        System.out.println("Nhap phan tu x: ");
        int x = scanner.nextInt();
        System.out.println("Nhap vi tri k: ");
        int k= scanner.nextInt();
        insert(a, n, a.length, k, x);
        System.out.println("Mang sau khi them la: ");
        show(n+1, a);
        System.out.println();
    
        scanner.close();
    }
}