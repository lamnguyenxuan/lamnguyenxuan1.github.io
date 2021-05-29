import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileExample {
    public static void main(String[] args) throws IOException {
        //Doc file
        File myFile = new File("input.txt");
        Scanner sc = new Scanner(myFile);
        while(sc.hasNextLine()){
            String data = sc.nextLine();
            System.out.println(data);
        }
        sc.close();

        //Ghi file
        File myFile2 = new File("output.txt");
        myFile2.createNewFile();

        FileWriter fileWriter = new FileWriter(myFile2);
        fileWriter.write("Lam");
        fileWriter.close();
        System.out.println("Thanh cong!");
    }
}
