public class Kitchen extends Employee {
    private int serviceCharge;

    public Kitchen(String id, String name, int age, int basicSalary, int serviceCharge) {
        super(id, name, age, basicSalary);
        this.serviceCharge = serviceCharge;
    }

    public Kitchen() {
    }

    @Override
    public void caculatorSalary() {
        // TODO Auto-generated method stub
        System.out.println("Luong nhan vien la: ");
        System.out.println(serviceCharge + super.getBasicSalary());
    }

    public int getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(int serviceCharge) {
        this.serviceCharge = serviceCharge;
    }
    
    @Override
    public void input() {
        // TODO Auto-generated method stub
        super.input();
        System.out.println("Nhap serviceCharge: ");
        serviceCharge = Integer.parseInt(sc.nextLine());
    }
}
