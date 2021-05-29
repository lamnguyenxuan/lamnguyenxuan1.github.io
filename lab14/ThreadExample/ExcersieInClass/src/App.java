import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
// import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        // TreeSet<Character> arr2 = new TreeSet<>();
        // Scanner sc = new Scanner(System.in);

        // System.out.println("Nhập bất kỳ để kiểm tra\nHoặc\nNhaapj Q hoặc q để thoát");
        // while(true){
        //     char n;
        //     n = sc.next().charAt(0);
        //     if(n == 'q' || n == 'Q'){
        //         break;
        //     }
        // }
        // while(Character.isLetter(ch))

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap gia tri vao");
        String input = sc.next();
        ArrayList<String> list = new ArrayList<>();
        while(!input.equals("q")){
            try{
                int num = Integer.parseInt(input);
                list.add(input);
                System.out.println("Nhap gia tri vao");
            } catch(Exception e){
                System.out.println("Gia tri nhap khong phai la so! Vui long nhap lai");
            }
            input = sc.next();
        }
        if(input.equals("q")){
            Collections.sort(list);
            for (String element : list) {
                System.out.println("Cac gia tri vua nhap duoc sap xep la: ");
                System.out.println(element);
            }
        }
        sc.close();
    }
}
