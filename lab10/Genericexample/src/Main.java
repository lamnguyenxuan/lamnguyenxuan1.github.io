public class Main {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<Integer>();
        intBox.add(5);
        Box<String> strBox = new Box<String>();
        strBox.add("Lam");

        System.out.println(intBox.get());
        System.out.println(strBox.get());
    }
    
}
