import java.util.Scanner;

public class Car {
    public String model;
    public String color;
    public String brand;

    public Car() {
    }
    public Car(String model, String color, String brand, Scanner sc) {
        this.model = model;
        this.color = color;
        this.brand = brand;
        this.sc = sc;
    }
    
    public void speed(){
        System.out.println("Goi toi phuong thuc speed");
    }
    public void size(){
        System.out.println("Goi toi phuong thuc size");
    }
    public void brand(){
        System.out.println("Goi toi phuong thuc brand");
    }

    Scanner sc = new Scanner(System.in);
    public void input(){
        System.out.println("Nhap model: ");
        model = sc.nextLine();
        System.out.println("Nhap color: ");
        color = sc.nextLine();
        System.out.println("Nhap brand: ");
        brand = sc.nextLine();
    }
    
    public void display(){
        System.out.println(model + " - " + color + " - " + brand);
    }
}
