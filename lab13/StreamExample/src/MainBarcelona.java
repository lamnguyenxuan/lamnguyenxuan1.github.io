import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainBarcelona {
    public static void main(String[] args) throws FileNotFoundException {
        File myFile = new File("Barcelona.txt");
        Scanner sc = new Scanner(myFile);
        List<Player>list = new ArrayList<>();

        while(sc.hasNextLine()){
            String s = sc.nextLine();
            String str[] = s.split("-");

            String name = str[0].trim();
            Position position = str[1].trim();

            list.add(new Player(name, position));
            
        }
        System.out.println("Danh sach: ");
        list.forEach(System.out::println);
        
        sc.close();
    }
}
