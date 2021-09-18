package CountTenThread2;

public class CountTenThread2 implements Runnable {
    public static void main(String[] args) {
        CountTenThread2 ct = new CountTenThread2();
        Thread th = new Thread(ct);
        th.start();
        for(int i=0; i<10; i++){
            System.out.println("main:i= "+i);
            // sleep(500);
        }
    }

    @Override
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("run:i= "+i);
            // sleep(500);
        }
    }
}
