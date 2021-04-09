public class Kitchen extends Employee {
    private int serviceCharge;

    public Kitchen() {
    }

    public Kitchen(int serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public int getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(int serviceCharge) {
        this.serviceCharge = serviceCharge;
    }
    
    @Override
    public void calculatorSalary() {
        // TODO Auto-generated method stub
        System.out.println("Luong nhan vien la: "+ (serviceCharge + super.getBasicSalary()));
    }
}
