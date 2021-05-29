import java.util.Scanner;

public abstract class Employee {
    private String id;
    private String name;
    private int age;
    private int basicSalary;

    public Employee() {
    }

    Scanner sc = new Scanner(System.in);

    public abstract void caculatorSalary();
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return id + " - " + name + " - " + age + " - " + basicSalary;
    }
    public Employee(String id, String name, int age, int basicSalary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.basicSalary = basicSalary;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
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
    public int getBasicSalary() {
        return basicSalary;
    }
    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    public void input(){
        System.out.println("Nhap id: ");
        id = sc.nextLine();
        System.out.println("Nhap name: ");
        name = sc .nextLine();
        System.out.println("Nhap tuoi: ");
        age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap luong co ban: ");
        basicSalary = Integer.parseInt(sc.nextLine());
    }
    
}
