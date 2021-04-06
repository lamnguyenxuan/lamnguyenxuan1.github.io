public class Employee{
    private int id;
    private String name;
    private String dateOfBirth;
    private String address;
    private String position;
    private int basicSalary;
    public Employee() {
    }

    public Employee(int id, String name, String dateOfBirth, String address, String position, int basicSalary) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.position = position;
        this.basicSalary = basicSalary;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public String getDateOfBirt(){
        return dateOfBirth;
    } 
    public void setDateOfBirth(String dateOfBirth){
         this.dateOfBirth = dateOfBirth;
    }

    public String getAddress(){
        return address;
    }
    public void seAddress(String address){
        this.address = address;
    }

    public String getPosition(){
        return position;
    }
    public void setPosition(String position){
        this.position = position;
    }

    public int getBasicSalary(){
        return basicSalary;
    }
    public void setBasicSalary(int basicSalary){
        this.basicSalary = basicSalary;
    }

    public void salaryCalculator(int basicSalary, int hour){
        System.out.println("Lương của Employee là: " + basicSalary + (100000 * hour));
    }
}