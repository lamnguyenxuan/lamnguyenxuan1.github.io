public class Main {
    public static void main(String[] args) {
        ThreadWithExtend thread = new ThreadWithExtend();
        ThreadWithExtend thread2 = new ThreadWithExtend();
        thread.start();
        // thread.stop();
        try {
            thread.join(3000);
            System.out.println(thread.getName());
            System.out.println(thread.getId());
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        thread2.start();
        try {
            thread2.join(3000);
            System.out.println(thread.getName());
            System.out.println(thread.getId());
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }
}
