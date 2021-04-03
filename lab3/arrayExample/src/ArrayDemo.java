import java.util.Scanner;

public class ArrayDemo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[20];
        int n = 5;
        for(int i=0; i<n; i++){
            System.out.printf("Nhap phan tu thu %d: ", i);
            a[i] = scanner.nextInt();
        }
        System.out.println("Mang a: ");
        show(n,a);

        //Them phan tu
        System.out.print("Nhap x: ");
        int x = scanner.nextInt();
        insert(a, n, a.length, x);
        System.out.println("Mang sau khi them: ");
        show(n+1,a);
        
        scanner.close();
    }

    public static void show(int n, int []a){
        for(int i=0; i<n; i++){
            System.out.println(a[i]);
        }
    }

    public static int insert(int []a, int n, int size, int x){
        if(n>= size){
            return n;
        }
        else{
            a[n] = x;
            return n + 1;
        }
    }
}