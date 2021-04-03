import java.util.Scanner;

public class mangdachieu {
    public static void main(String[] args) {
        // int [][] a = new int[3][3];
        // a[0][0] = 5;
        // a[0][1] = 2;
        // a[0][2] = 7;
        // a[1][0] = 9;
        // a[1][1] = 6;
        // a[1][2] = 1;
        // a[2][0] = 4;
        // a[2][1] = 0;
        // a[2][2] = 5;
        
        //  System.out.println("Mang a: ");
        // for(int i = 0; i<3; i++){
        //     for(int j=0; j<3; j++){
        //         System.out.print(a[i][j] + "\t");
        //     }
        //     System.out.println();
        // }

        // System.out.println();

        //  System.out.println("Mang b: ");
        //  int [][] b = new int[3][3];
        // b[0][0] = 5;
        // b[0][1] = 2;
        // b[0][2] = 7;
        // b[1][0] = 9;
        // b[1][1] = 6;
        // b[1][2] = 1;
        // b[2][0] = 4;
        // b[2][1] = 0;
        // b[2][2] = 5;
        
        // for(int i = 0; i<3; i++){
        //     for(int j=0; j<3; j++){
        //         System.out.print(b[i][j] + "\t");
        //     }
        //     System.out.println();
        // }

        //  System.out.println();
        // System.out.println("Tong 2 mang: ");
        // for(int  i=0; i<3; i++){
        //     for(int j=0; j<3; j++){
        //         System.out.print(a[i][j]+b[i][j] + "\t");
        //     }
        //     System.out.println();
        // }

        Scanner scanner = new Scanner(System.in);
        // System.out.println("Nhap n: ");
        // int n = scanner.nextInt();
        //    for(int  i=0; i<3; i++){
        //     for(int j=0; j<3; j++){
        //         System.out.print(a[i][j] * n + "\t");
        //     }
        //     System.out.println();
        // }

        // int [][]c = new int [3][3]; 
        // for(int i=0; i<3; i++){
        //     for(int j=0; j<3; j++){
        //         c[i][j] = a[j][i];
        //     }
        // }

        // System.out.println("Mang c: ");
        //    for(int  i=0; i<3; i++){
        //     for(int j=0; j<3; j++){
        //         System.out.print(c[i][j]+ "\t");
        //     }
        //     System.out.println();
        // }

        System.out.print("Nhap n: ");
        int n = scanner.nextInt();
        System.out.println("Nhap cac phan tu mang: ");

        int [][]arr1 = new int[n][n];

          for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr1[i][j] = scanner.nextInt(); 
            }
        }

        System.out.println("Mang da chieu la: ");
         for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr1[i][j] + "\t"); 
            }
            System.out.println();
        }

        System.out.println("Cac phan tu chia het cho 5 la: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr1[i][j]%5==0) System.out.println(arr1[i][j]);
            }
        }
    }   
}
