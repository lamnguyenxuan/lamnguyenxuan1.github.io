import java.util.Scanner;

public class Person{
    private int id;
    private String name;
    private int age;
    private String address;

    Scanner sc = new Scanner(System.in);
    public Person() {
    }

    public Person(int id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void Input(){
        System.out.println("Nhap id: ");
        id = Integer.valueOf(sc.nextLine());
        System.out.println("Nhap ten: ");
        name = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        age = Integer.valueOf(sc.nextLine());
        System.out.println("Nhap dia chi: ");
        address = sc.nextLine();
    }

    public void Display(){
        System.out.print("id: " + id + " ten: " + name + " age: " + age + " dia chi: " + address);
    }
}