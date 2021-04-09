import java.util.Scanner;

public class Library{
    private String ms;
    private String name;
    private String nxb;
    private int year;
    private int amount;

    Scanner sc = new Scanner(System.in);

    public String getMs(){
        return ms;
    }
    public void setMs(String ms){
        this.ms = ms;  
    }

    public String getName(){
        return name;
    }
    public void setName(String ms){
        this.ms = ms;  
    }

    public String getNxb(){
        return nxb;
    }
    public void setNxb(String nxb){
        this.nxb = nxb;  
    }

    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;  
    }

    public int getAmount(){
        return amount;
    }
    public void setAmount(int amount){
        this.amount = amount;  
    }

     public Library(String ms, String name, String nxb, int year, int amount, Scanner sc) {
        this.ms = ms;
        this.name = name;
        this.nxb = nxb;
        this.year = year;
        this.amount = amount;
        this.sc = sc;
    }
    public Library() {
    }

    public void input(){
        System.out.println("Nhap ma sach: ");
        ms = sc.nextLine();
        System.out.println("Nhap ten sach: ");
        name = sc.nextLine();
        System.out.println("Nhap nha xuat ban: ");
        nxb = sc.nextLine();
        System.out.println("Nhap nam xuat ban: ");
        year = Integer.valueOf(sc.nextLine());
        System.out.println("Nhap so luong: ");
        amount = Integer.valueOf(sc.nextLine());
    }
}