import java.util.Scanner;

public class Student {
    public int id;
    public String name;
    public int dlt;
    public int dth;
    public String school;
    
    Scanner sc = new Scanner(System.in);
    public void input(){
        System.out.println("Nhap id: ");
        id = sc.nextInt();
        System.out.println("Nhap name: ");
        name = sc.nextLine();
        System.out.println("Nhap dlt: ");
        dlt = sc.nextInt();
        System.out.println("Nhap dth: ");
        dth = sc.nextInt();
        System.out.println("Nhap school: ");
        school = sc.nextLine();
    }
    public int grade(int dlt, int dth){
        return (dlt+dth)/2;
    }
    public void display(){
        System.out.println(id + " " + name + " " + dlt + " " + dth + " " + school);
    }
}
