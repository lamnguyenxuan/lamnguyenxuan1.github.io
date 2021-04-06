import java.util.Scanner;

public class Dog {
    private String breed;
    private String size;
    private int age;
    private String color;

    public String getBreed(){
        return breed;
    }
    public void setBreed(String breed){
        this.breed= breed;
    }

    public String getSize(){
    return size;
    }
    public void setSize(String size){
        this.size= size;
    }

    public int getAge(){
    return age;
    }
    public void setAge(int age){
        this.age= age;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color= color;
    }

    public void eat(){
        System.out.println("Goi toi phuong thuc eat()");
    }
    public void sleep(){
        System.out.println("Goi toi phuong thuc sleep()");
    }
    public void run(){
        System.out.println("Goi toi phuong thuc run: ");
    }
    Scanner sc = new Scanner(System.in);
    public void input(){
        System.out.println("Nhap breed: ");
        breed = sc.nextLine();
        System.out.println("Nhap size: ");
        breed = sc.nextLine();
        System.out.println("Nhap age: ");
        breed = sc.nextLine();
        System.out.println("Nhap color: ");
        breed = sc.nextLine();
    }
}
