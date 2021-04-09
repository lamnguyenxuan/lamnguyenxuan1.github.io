import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
       ArrayList<Integer> arr = new ArrayList<Integer>();
       System.out.println("Mang cac so tu 0 den 100 la: ");
       for(int i=0;i<=100;i++){
           arr.add(i);
       }
       System.out.println(arr);
       System.out.println();
       System.out.println("Mang cac so chan tu 0 den 100 la: ");
       ArrayList<Integer> arr1 = new ArrayList<Integer>();
       for(int i=0;i<=100; i++){
           if(i%2==0){
               arr1.add(i);
           }
       }
    //    for(int i : arr1){
    //        System.out.print(i + " ");
    //    }
    System.out.println(arr1);
    }
}
