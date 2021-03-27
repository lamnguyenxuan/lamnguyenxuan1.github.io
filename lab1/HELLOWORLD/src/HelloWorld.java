import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Toi ten la Lam");
        String str = "  Hello world  ";
        System.out.println(str.toUpperCase()); 
        System.out.println(str.toLowerCase());    
        System.out.println(str.length());
        System.out.println(str.trim());

        String s1= "Java";
        String s2= "JAVA";
        String s3= "Java";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s2));

        // enum Season {
        //     WINTER, SUMMNER, SPRING, AUTUMN;
        // }

        // Season season = Season.SPRING;
        // System.out.println(season);

        // Season season2 = Season.AUTUMN;
        // System.out.println(season2);

        //Lay ngay hien tai
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        //Lay ngay va gio hien tai
        LocalDateTime currentDateTIme = LocalDateTime.now();
        System.out.println(currentDateTIme);
        
        //Dinh dang ngay gio
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dateFormat = currentDateTIme.format(dateTimeFormatter);
        System.out.println(dateFormat);

        //KIeu chuyen doi ngam dinh
        int i = 5;
        float j = i;
        System.out.println("Ep kieu: " + j);

        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Nhập n: ");
        n = Integer.parseInt(scanner.nextLine());
        System.out.println("n sau khi nhap la: "+n);

        System.out.print("Nhap chuoi str1 : ");
        String str1 = scanner.nextLine();
        System.out.println(str1);

        //Nhap ten, tuoi, dia chi. In ra man hinh.
        String ten, diaChi;
        int tuoi;
        System.out.println("Nhập tên: ");
        ten = scanner.nextLine();
        System.out.println("Nhập tuổi:");
        tuoi = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập địa chỉ: ");
        diaChi = scanner.nextLine();
        System.out.println("Tên là: " + ten);
        System.out.println("Tuổi là: " + tuoi);
        System.out.println("Địa chỉ là: " + diaChi);
    }
}
