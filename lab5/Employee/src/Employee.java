import java.util.Scanner;

public class Employee{
    private int id;
    private String name;
    private String address;
    private String dateOfBirth;
    
    Scanner sc = new Scanner(System.in);
    public Employee() {
    }
    public Employee(int id, String name, String address, String dateOfBirth) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
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
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    int n;
    public void input(){
            System.out.println("Nhap id: ");
            id =Integer.valueOf(sc.nextLine());
            System.out.println("Nhap ten: ");
            name = sc.nextLine();
            System.out.println("Nhap dia chi: ");
            address = sc.nextLine();
            System.out.println("Nhap ngay sinh: ");
            dateOfBirth = sc.nextLine();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "id: " + id + " name: " + name + " address: " + address + " dateOfBirth: " + dateOfBirth;
    }
    
}