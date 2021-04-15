import java.io.File;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      // try {
      //    System.out.println("Nhap a: ");
      //  Scanner sc = new Scanner(System.in);
      //  int a = sc.nextInt();
      //  System.out.println("Nhap b: ");
      //  int b = sc.nextInt();
      //  double c = a/b;
      //  System.out.println("a/b la: " + c);
      // } catch (Exception e) {
      //   //TODO: handle exception
      //   System.out.println("Khong thuc hien duoc phep tinh");
      //   e.printStackTrace();
      // }
      //  //e.printstacktree

    //   Scanner sc = new Scanner(System.in);
    //   int n=0;
    //  try {
    //     System.out.println("Nhap so luong phan tu: ");
    //     n = sc.nextInt();
    //  } catch (Exception e) {
    //    //TODO: handle exception
    //    System.out.println("Phan tu vua nhap khong hop le");
    //  }

    //   int arr[] = new int[n];
      String url = "MyFIle.txt";

      File file = new File(url);

      try {
           Scanner readFile = new Scanner(file);  
           System.out.println("Correct");
      } catch (Exception e) {
        //TODO: handle exception
        System.out.println(e.getMessage());
        // e.printStackTrace();
      }
    }
}
