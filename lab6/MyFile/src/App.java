import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

// import jdk.jfr.events.FileWriteEvent;

public class App {
    public static void main(String[] args) throws Exception {
        File file = new File("MyFile.txt");
        file.createNewFile();

        FileWriter filewriter = new FileWriter(file);
        filewriter.write("java");
        filewriter.write("HTML//CSS");
        filewriter.write("Python");
        filewriter.write("C++");
        filewriter.close();

        File myFile = new File("File.txt");
        Scanner fileRead = new Scanner(myFile);
        while(fileRead.hasNextLine()){
            System.out.println(fileRead.nextLine());
        }
    }
}
