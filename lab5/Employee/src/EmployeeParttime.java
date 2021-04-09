public class EmployeeParttime extends Employee{
    private int workingHour;

    public EmployeeParttime() {
    }

    public EmployeeParttime(int id, String name, String address, String dateOfBirth, int workingHour) {
        super(id, name, address, dateOfBirth);
        this.workingHour = workingHour;
    }

    public int getWorkingHour() {
        return workingHour;
    }

    public void setWorkingHour(int workingHour) {
        this.workingHour = workingHour;
    }
    
    @Override
    public void input() {
        // TODO Auto-generated method stub
        super.input();
        System.out.println("Nhap working hour: ");
        workingHour = Integer.valueOf(sc.nextLine());
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " workingHour" + workingHour;
    }
    int nvparttime;
    public void caculatorSalary(){
        nvparttime = workingHour*100000*30;
        System.out.println("Luong la: " + nvparttime);
    }
    
}
