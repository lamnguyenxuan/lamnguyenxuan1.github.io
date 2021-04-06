import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        // Person p = new Person();
        // p.name = "Lam";
        // p.age = 25;

        // p.eat();
        // p.study("English");

        // Person p1 = new Person();
        // p1.name = "Linh";
        // p1.age = 20;

        // p1.display();

        // System.out.println(p1.toString());

        /*
        Person p1 = new Person();
        p1.name = "Jane";
        p1.age = 25;
        p1.gender = "female";
        p1.address = "HN";

        Person p2 = new Person();
        p2.name = "John";
        p2.age = 30;
        p2.gender = "male";
        p2.address = "HCM";
        */

        /*
        Dog obj1 = new Dog();//Tao bang constructer mac dinh
        obj1.bread = "German Shepherds";
        obj1.size = "Large";
        obj1.color = "White and Grey";
        obj1.age = 6;
        obj1.display();

        Dog obj2 = new Dog("Bulldog", "Large", "Light Grey", 5);//Tao bang constructer co tham so
        obj2.display();

        Dog []dog = new Dog[2]; //Tao mang
        for(int i=0;i<dog.length; i++){
            dog[i] = new Dog(); //Tao doi tuong
            dog[i].input();
        }

        System.out.println("Mang vua nhap: ");
        for(int i=0; i<dog.length;i++){
            System.out.printf("obj%d ",i);
            dog[i].display();
        }
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        Car []car = new Car[n];
        for(int i=0; i<car.length; i++){
            System.out.println("Nhap thong tin: ");
            car[i] = new Car();
            car[i].input();
        }
        System.out.println("Mang vua nhap: ");

        for(int i=0; i<car.length;i++){
            car[i].display();
        }
        sc.close();
    }
}
