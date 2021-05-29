import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainPerson {
    public static void getData() throws FileNotFoundException{
        File myFile = new File("input.txt");
        Scanner sc = new Scanner(myFile);
        List<Person> list = new ArrayList<>();

        while(sc.hasNextLine()){
            String s = sc.nextLine();
            String str[] = s.split("-");

            String name = str[0].trim();
            int age = Integer.valueOf(str[1].trim());
            String address = str[2].trim();

            list.add(new Person(name, age, address));
        }
        System.out.println("Danh sach: ");
        list.forEach(System.out::println);

        sc.close();
    }
}
