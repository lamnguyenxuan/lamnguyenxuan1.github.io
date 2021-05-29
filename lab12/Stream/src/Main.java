import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 8, 9, 1, 4, 5, 6, 3);

        //Su dung lambda
        System.out.println("Danh sach ban dau: ");
        list.forEach(n -> System.out.println(n + "\t"));

        System.out.println("\nDanh sach sau khi sap xep: ");
        list.stream()
        .sorted((a, b) -> a.compareTo(b))
        .forEach(n -> System.out.println(n + "\t"));

        System.out.println("\nDanh sach cac so chan: ");
        list.stream()
        .filter(n -> n%2 ==0)
        .sorted((a,b) -> a.compareTo(b))
        .forEach(n -> System.out.print(n + "\t"));

        //Su dung method reference
        System.out.println("\nDanh sach ban dau: ");
        list.forEach(System.out::println);

        System.out.println("Danh sach sau khi sap xep: ");
        list.stream()
        .sorted((Integer::compareTo))
        .forEach(System.out::println);
        
    }
}
