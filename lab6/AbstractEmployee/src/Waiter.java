public class Waiter extends Employee {
    private int compensate;

    

    public Waiter() {
    }

    public int getCompensate() {
        return compensate;
    }

    public void setCompensate(int compensate) {
        this.compensate = compensate;
    }

    @Override
    public void calculatorSalary() {
        // TODO Auto-generated method stub
        System.out.println("Luong nhan vien la: "+ (super.getBasicSalary() + compensate));
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " " + compensate;
    }

    public Waiter(int id, String name, int age, int basicSalary, int compensate) {
        super(id, name, age, basicSalary);
        this.compensate = compensate;
    }
}
