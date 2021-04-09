import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList <String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("Mazda");
        cars.add("Kia");
        cars.add(1, "Vinfast");

        System.out.println("Phan tu o vi tri thu 2: " + cars.get(2));
        System.out.println("Mang sua khi cap nhat la: ");
        for(String s : cars){
            System.out.println(s);
        }
        cars.remove("BMW");
        System.out.println("Mang sau khi xoa la: ");
         for(String s : cars){
            System.out.println(s);
        }

        ArrayList <String>list = new ArrayList<String>();
        list.addAll(cars);
        list.add("Vinfast");
        list.add("Rollroys");
        System.out.println("list: ");
        for(String l : list){
            System.out.println(l);
        }
        list.removeAll(cars);
        System.out.println("List sau khi remove la: ");
    }
}
