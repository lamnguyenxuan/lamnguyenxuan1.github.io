public class ThreadWithExtend extends Thread{
    @Override
    public void run() {
        // TODO Auto-generated method stub
        for(int i=0; i< 5; i++){
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                //TODO: handle exception
                e.printStackTrace();
            }
        }
    }
}