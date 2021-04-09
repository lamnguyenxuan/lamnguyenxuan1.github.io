public class EmployeeFulltime extends Employee{
    private int salaryBonus;

    public EmployeeFulltime() {
    }

    public EmployeeFulltime(int id, String name, String address, String dateOfBirth, int salaryBonus) {
        super(id, name, address, dateOfBirth);
        this.salaryBonus = salaryBonus;
    }

    public int getSalaryBonus() {
        return salaryBonus;
    }

    public void setSalaryBonus(int salaryBonus) {
        this.salaryBonus = salaryBonus;
    }
    
    @Override
    public void input() {
        // TODO Auto-generated method stub
        super.input();
        System.out.println("Nhap luong thuong: ");
        salaryBonus = Integer.valueOf(sc.nextLine());
    }
    int nvfulltime;
    public void caculatorSalary(){
        nvfulltime = 8 * 100000 * 30 + salaryBonus;
    }
    
}   