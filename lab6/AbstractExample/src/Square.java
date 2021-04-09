public class Square extends Shape {
    private double canh;

    public Square() {
    }

    public Square(double canh) {
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }
    
    @Override
    public void tinhDienTich() {
        // TODO Auto-generated method stub
        System.out.println("Dien tich hinh vuong la: " + canh*canh);
    }

    @Override
    public void tinhChuVi() {
        // TODO Auto-generated method stub
        System.out.println("Chu vi hinh vuong la: " + 4*canh);
    }
}
