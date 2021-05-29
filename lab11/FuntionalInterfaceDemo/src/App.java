import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class App {
    public static void main(String[] args) throws Exception {
        List <String> list = Arrays.asList("Java", "HTML", "Python");

        list.forEach(new Consumer<String>(){
            @Override
            public void accept(String t) {
                System.out.println(t);
            }
        });
    }
}
