import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws Exception {
        //Su dung lop vo danh
        Sayable sayable = new Sayable(){
            @Override
            public String say(){
                return "Hello!!!";
            }

        };
        System.out.println(sayable.say());

        //SU dung lambda
        Sayable sayableUsingLambda = () -> {
            return "Hello lambda!!!";
        };
        System.out.println(sayableUsingLambda.say());
        
        //Su dung lambda co tham so
        Sayable2 sayable2 = (str) -> {
            return str.toUpperCase();
        };
        System.out.println(sayable2.say("Meo meo meo!!!"));

        //Su dung lambda co nhieu tham so

        AddNumber addNumber = (a,b) -> (a+b); 
        //{
           // return a+b;
        //};
        System.out.println("Tong hai so: "+addNumber.add2Number(5, 9));

        //SU dung lop vo danh
        AddNumber addNumber2 = new AddNumber(){
            @Override
            public int add2Number(int a, int b){
                return a+b;
            }
        };
        System.out.println(addNumber2.add2Number(10, 20));

        //ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Hung");
        list.add("Linh");
        list.add("Tam");
        list.add("Quan");

        //Dung for each
        System.out.println("Su dung for each: ");
        for (String s : list) {
            System.out.println(s);
            
        }
        //Dung lambda
        System.out.println("Su dung lambda: ");
        list.forEach(n -> System.out.println(n));

        //Sap xep theo cach binh thuong
        Collections.sort(list, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2){
                return o1.compareTo(o2);
            }
        });
        System.out.println("Danh sach sau khi sap xep: ");
        list.forEach(n -> System.out.println(n));
        //list.forEach(System.out::println);

        //Sap xep su dung lambda
        Collections.sort(list, (String o1, String o2) -> {
            return o1.compareTo(o2);
        });

        Collections.sort(list, (o1, o2) -> o1.compareTo(o2));
        System.out.println("Danh sach sau khi sap xep voi lambda:");
        list.forEach(n -> System.out.println(n));
    }
}
