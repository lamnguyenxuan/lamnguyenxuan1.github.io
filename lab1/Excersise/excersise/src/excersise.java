import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class excersise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Câu 1: Chỉ ra sự giống và khác nhau giữa biến và hằng
        Giống: Cần khai báo trước để sử dụng
        Khác:
        - Hằng: Giá trị của hằng không thể thay đổi trong quá trình thực hiện chương trình
        - Biến: Giá trị của biến có thể thay đổi trog quá trình thực hiênj chương trình
        */
        
        //Câu 2: Viết chương trình nhập vào từ bàn phím chuỗi bất kỳ, in ra màn hình kích thước của chuỗi đó
        String str;
        System.out.println("Nhập từ bàn phím 1 chuỗi bất kỳ: ");
        str = scanner.nextLine();
        System.out.println("Chuỗi vừa nhập là: " + str);
        //Câu 3: Viết chương trình lấy ngày và giờ hiện tại và in theo định dạng HH:mm  dd/MM/yyyy
        System.out.println("Ngày giờ hiện tại là: ");
        LocalDateTime currentDateTIme = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy");
        String dateFormat = currentDateTIme.format(dateTimeFormatter);
        System.out.println(dateFormat);
        //Câu 4: Viết chương trình nhập vào từ bàn phím 2 chuỗi và thực hiện so sánh hai chuỗi đó
        String str1, str2;
        System.out.println("Nhập vào màn hình chuỗi 1:");
        str1 = scanner.nextLine();
        System.out.println("Nhập vào màn hình chuỗi 2:");
        str2 = scanner.nextLine();
        System.out.println(str1.equals(str2));
    }
}
