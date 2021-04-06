import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Employee e = new Employee();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập lương cơ bản: ");
        int x = sc.nextInt();
        e.setBasicSalary(x);
        System.out.println("Nhập số giờ tăng ca: ");
        int hour = sc.nextInt();
        e.salaryCalculator(e.getBasicSalary(), hour);
        sc.close();
    }
}
