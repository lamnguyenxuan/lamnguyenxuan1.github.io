import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap so luong Waiter: ");
        n = Integer.valueOf(sc.nextLine());
        ArrayList<Waiter> list1 = new ArrayList<>(); 
        for(int i=0; i<n; i++){
            Waiter waiter = new Waiter();
            waiter.input();
            list1.add(waiter);
        }
        System.out.println("Danh sach duoc sap xep theo ten: ");
        Collections.sort(list1, new Comparator<Waiter>(){

            @Override
            public int compare(Waiter o1, Waiter o2) {
                // TODO Auto-generated method stub
                return o1.getName().compareTo(o2.getName());
            }
            
        });
        for(Waiter w : list1){
            System.out.println(w);
        }

        System.out.println("Danh sach duoc sap xep theo tuoi: ");
        Collections.sort(list1, new Comparator<Waiter>(){

            @Override
            public int compare(Waiter o1, Waiter o2) {
                // TODO Auto-generated method stub
                return o1.getAge() > o2.getAge() ? 1 : -1;
            }
            
        });
        for(Waiter w: list1){
            System.out.println(w);
        }

        //
        int m;
        System.out.println("Nhap so luong Kitchen: ");
        m = Integer.valueOf(sc.nextLine());
        ArrayList<Kitchen> list2 = new ArrayList<>(); 
        for(int i=0; i<m; i++){
            Kitchen kitchen = new Kitchen();
            kitchen.input();
            list2.add(kitchen);
        }
        System.out.println("Danh sach duoc sap xep theo ten: ");
        Collections.sort(list2, new Comparator<Kitchen>(){

            @Override
            public int compare(Kitchen o1, Kitchen o2) {
                // TODO Auto-generated method stub
                return o1.getName().compareTo(o2.getName());
            }
            
        });
        for(Kitchen k : list2){
            System.out.println(k);
        }

        System.out.println("Danh sach duoc sap xep theo tuoi: ");
        Collections.sort(list2, new Comparator<Kitchen>(){

            @Override
            public int compare(Kitchen o1, Kitchen o2) {
                // TODO Auto-generated method stub
                return o1.getAge() > o2.getAge() ? 1 : -1;
            }
            
        });
        for(Kitchen w: list2){
            System.out.println(w);
        }
        sc.close();
    }
}
