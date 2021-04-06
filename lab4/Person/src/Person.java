public class Person {
    public int id;
    public String name;
    public int age;
    public String gender;
    public String address;    

    public void study(String subject){
        System.out.println("Goi toi phuogbg thuc study()");
    }

    public void display(){
        System.out.println(name + " - " + age);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return name + "\t" + age;
    }

    // public Person(){
    //     System.out.println("Goi toi constructer");
    // }

    // public void job(){
    //     System.out.println("Goi toi phuong thuc job()");
    // }
    // public void sleep(){
    //     System.out.println("Goi toi phuong thuc sleep()");
    // }
    // public void hobby(){
    //     System.out.println("Goi toi phuong thuc hobby()");
    // }

    // public Person(int id, String name, int age, String gender, String address) {
    //     this.id = id;
    //     this.name = name;
    //     this.age = age;
    //     this.gender = gender;
    //     this.address = address;
    // }


}
