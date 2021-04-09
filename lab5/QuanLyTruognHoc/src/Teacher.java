public class Teacher extends Person{
    private int salary;

    public Teacher() {
    } 

    public Teacher(int id, String name, int age, String address, int salary) {
        super(id, name, age, address);
        this.salary = salary;
    }
                    
    @Override
    public void Input() {
        // TODO Auto-generated method stub
        super.Input();
        System.out.println("Nhap luong: ");
        salary = Integer.valueOf(sc.nextLine());
    }

    @Override
    public void Display() {
        // TODO Auto-generated method stub
        super.Display();
        System.out.print(" salary :" + salary);
    }
    
    public void Subject(){
        System.out.println();
    }
}