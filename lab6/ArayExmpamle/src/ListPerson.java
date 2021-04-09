import java.util.ArrayList;
import java.util.Scanner;

public class ListPerson {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Person> list = new ArrayList<Person>();
        // Person person = new Person("Lam", 25);
        // list.add(person);
        // list.add(new Person("Loan", 30));
        System.out.println("Nhap so luong: ");
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0; i<n; i++){
            System.out.printf("Nhap nguoi thu %d \n", i);
            String name = sc.nextLine();
            int age = Integer.parseInt(sc.nextLine());

            list.add(new Person(name, age));
        }
        System.out.println("Mang ban dau la: ");
        for(Person persons : list){
            System.out.println(persons.toString());
        }
        list.get(1).setName("Hung");
        System.out.println("Mang sau khi them Hung la: ");
        for(Person persons : list){
            System.out.println(persons.toString());
        }

        // for(int i=0; i<list.size();i++){
        //     if(list.get(i).getName().equals("Hung")){
        //         list.remove(i);
        //     }
        // }
        list.remove("Hung");
        System.out.println("Mang sau khi xoa la: ");
        for(Person persons : list){
            System.out.println(persons.toString());
        }
    }
}
