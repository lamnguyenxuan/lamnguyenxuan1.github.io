public class Student12 {
    int id;
    String name;
 
    Student12(int i, String n) {
        id = i;
        name = n;
    }
 
    void display() {
        System.out.println(id + " " + name);
    }
 
    public static void main(String args[]) {
        Student12 e1 = new Student12(111, "Viet");
        Student12 e2 = new Student12(222, "Nam");
        e1.display();
        e2.display();
    }
}