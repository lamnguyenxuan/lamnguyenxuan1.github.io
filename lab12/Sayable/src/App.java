import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ngoc");
        list.add("Linh");
        list.add("Tam");
        list.add("Quan");

        System.out.println("Su dung lambda");
        list.forEach(n -> System.out.println(n));

        System.out.println("Su dung reference: ");
        list.forEach(System.out::println);
        
    }
}
