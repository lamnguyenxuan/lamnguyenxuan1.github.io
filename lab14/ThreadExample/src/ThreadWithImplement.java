import java.util.ArrayList;
import java.util.Random;

public class ThreadWithImplement implements Runnable {

    @Override
    public void run() {
        
        // for(int i=10; i>=0;i--){
        //     System.out.println(i);
        //     try {
        //         Thread.sleep(1000);
        //     } catch (InterruptedException e) {
                
        //         e.printStackTrace();
        //     }
        // }
        // System.out.println("Hết giờ");
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        boolean choose = true;
        int dem=0;
        while(choose){
            int value = random.nextInt(10) + 1;
            if(!list.contains(value)){
                list.add(value);
                dem++;
            }
            if(dem==10){
                choose = false;
            }
        }
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    
}
