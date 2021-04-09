public class Circle extends Shape {
    private double banKinh;

    public Circle() {
    }

    public Circle(double banKinh) {
        this.banKinh = banKinh;
    }
    
    @Override
    public void tinhDienTich() {
        // TODO Auto-generated method stub
        System.out.println("Dien tich hinh tron: " + (Math.PI* banKinh * banKinh));
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public void tinhChuVi() {
        // TODO Auto-generated method stub
        System.out.println("Chu vi hinh tron: " + (2*banKinh*3.14));
    }
    
}
