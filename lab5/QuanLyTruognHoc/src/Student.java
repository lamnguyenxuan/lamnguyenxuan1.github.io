public class Student extends Person {
    private int theoreticalPoint;
    private int practicePoint;

    public Student() {
    }

    public Student(int id, String name, int age, String address, int theoreticalPoint, int practicePoint) {
        super(id, name, age, address);
        this.theoreticalPoint = theoreticalPoint;
        this.practicePoint = practicePoint;
    }

    public int getTheoreticalPoint() {
        return theoreticalPoint;
    }

    public void setTheoreticalPoint(int theoreticalPoint) {
        this.theoreticalPoint = theoreticalPoint;
    }

    public int getPracticePoint() {
        return practicePoint;
    }

    public void setPracticePoint(int practicePoint) {
        this.practicePoint = practicePoint;
    }
    
    @Override
    public void Input() {
        // TODO Auto-generated method stub
        super.Input();
        System.out.println("Nhap diem ly thuyet: ");
        theoreticalPoint = Integer.valueOf(sc.nextLine());
        System.out.println("Nhap diem thuc hanh: ");
        practicePoint = Integer.valueOf(sc.nextLine());
    }

    @Override
    public void Display() {
        // TODO Auto-generated method stub
        super.Display();
        System.out.print(" diem ly thuyet la: " + theoreticalPoint + "diem thuc hanh la: " + practicePoint);
    }
    
    public void GPA(){
        System.out.println("diem trung binh la: " + (theoreticalPoint+practicePoint)/2);
    }


}
