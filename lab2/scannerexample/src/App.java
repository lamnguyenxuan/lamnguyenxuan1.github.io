import java.util.Scanner;
import java.lang.Math;


public class App {
     public static boolean ischecked(int n){
       if(n<2){
           return false;
       }
       else{
           for(int i=2; i<=Math.sqrt(n); i++){
               if(n%i==0){
               return false;
               }
           }
        return true;
        }
    }
    public static void main(String[] args) throws Exception {
           Scanner scanner = new Scanner(System.in);
    //    double a, b, c;
    //    a = 3;
    //     b = 4;
    //     c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
    //     System.out.println(c);
    
    /* 
    double x, y, BMI;
    System.out.println("Nhap can nang: ");
    x = scanner.nextDouble();
    System.out.println("Nhap chieu cao: ");
    y = scanner.nextDouble();
    BMI = x/(Math.pow(y, 2));
    System.out.printf("Chi so BMI la: %.2f\n", BMI);
    if(BMI < 18.5){
        System.out.println("Thieu can");
    }
    else if(BMI >= 18.5 && BMI <= 24.9){
        System.out.println("Can doi");
    }
    else
        System.out.println("Thua can");
    }
    */
     /* 
    System.out.println("Nhap thang bat ky: ");
    int month = scanner.nextInt();
    switch(month){
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12: 
            System.out.println("Thang co 31 ngay");
            break;
        case 2:
            System.out.println("Thang co 28 hoac 29 ngay");
            break;
        case 4:
        case 6:
        case 9:
        case 11: 
            System.out.println("Thang co 30 ngay");
            break;
        default:
            System.out.println("Khong co thang nay");
            break;
    }
    */
    
    // for(int i=0; i<=10; i++){
    //     if(i%2==0){
    //         System.out.println(i);
    //     }
    // }

    // for (int i = 2; i < 10; i++){
    // if(i%2 == 0){
    // continue;
    // }
    // System.out.println(i);
    // }

    /*
    for(int n=1; n<100; n++){
        if(n%3==0){
            if(n%5!=0){
            System.out.println(n + ": Fizz");
            }
            else{
                System.out.println(n + ": FizzBuzz");
            }
        }
        else {
            if(n%5==0){
            System.out.println(n + ": Buzz");
            }
            else{
                System.out.println(n);
            }
        }
    }
    */
    
    /*
    int i=1;
    while(i<=10){
        if(i%2==0){
        System.out.println(i);
        }
        i++;
    }
    */

    /*
    System.out.println("nhap n:");
    int n = scanner.nextInt();
    int sum=0;
    for(int i=0; i<n; i++){
        sum += i;
    }
    System.out.println("Tong la: " + sum);
    */

    // System.out.println("Nhap n:");
    // int n = scanner.nextInt();
    // for(int i=0; i<=n; i++){
    //     if(ischecked(i)){
    //         System.out.println(i);
    //     }
    // }

        // int count = 0;
        // int i = 2;
        // while(count<n){
        //     if(ischecked(i)){
        //         System.out.println(i);
        //         count++;
        //     }
        //     i++;
        // }
        /*
        System.out.println("Nhap a:");
        int a = scanner.nextInt();
        System.out.println("Nhap b:");
        int b = scanner.nextInt();
        if(a==0){
            if(b==0) System.out.println("Phuong trinh vo so nghiem");
        else System.out.println("Phuong trinh vo nghiem");
        }
        else{
            System.out.println("Phuong trinh co nghiem la: " + (double)-b/a);
        }
        */

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
    }
}
