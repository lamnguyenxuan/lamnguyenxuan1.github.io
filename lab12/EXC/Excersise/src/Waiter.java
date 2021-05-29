public class Waiter extends Employee {
    private int compensate;

    @Override
    public void caculatorSalary() {
        // TODO Auto-generated method stub
        System.out.println("Luong boi ban: " );
        System.out.println(compensate + super.getBasicSalary());
    }

    public Waiter(String id, String name, int age, int basicSalary, int compensate) {
        super(id, name, age, basicSalary);
        this.compensate = compensate;
    }

    public Waiter() {
        
    }

    public int getCompensate() {
        return compensate;
    }

    public void setCompensate(int compensate) {
        this.compensate = compensate;
    }
    @Override
    public void input() {
        // TODO Auto-generated method stub
        super.input();
        System.out.println("Nhap compensate: ");
        compensate = Integer.parseInt(sc.nextLine());
    }
}
