import java.util.Scanner;

public class Dog {
    Scanner sc = new Scanner(System.in);
    
    public String bread;
    public String size;
    public String color;
    public int age;

    public void eat(){
        System.out.println();
    }
    public void run(){
        System.out.println();
    }
    public void name(){
        System.out.println();
    }

    public void display(){
        System.out.println(bread + " " + size + " " + color + " " + age);
    }

    public Dog() {
    }

    public Dog(String bread, String size, String color, int age) {
        this.bread = bread;
        this.size = size;
        this.color = color;
        this.age = age;
    }

    public void input(){
        System.out.println("Nhap giong");
        bread = sc.nextLine();
        System.out.println("Nhap kich co");
        size = sc.nextLine();
        System.out.println("Nhap mau");
        color = sc.nextLine();
        System.out.println("Nhap tuoi");
        age = sc.nextInt();
    }
}