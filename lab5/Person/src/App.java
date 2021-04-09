public class App {
    public static void main(String[] args) throws Exception {
      /* Teacher teacher = new Teacher();
       teacher.input();

       System.out.println("Thong tin giang vien la: ");
       System.out.println(teacher.toString());
       */

      //upcasting
      Library sBook = new SchoolBook();

      //downcasting
      SchoolBook schoolBook2 = (SchoolBook) sBook; 
        SchoolBook s = (SchoolBook) new Library();
    }
}
