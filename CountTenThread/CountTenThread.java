package CountTenThread;

public class CountTenThread extends Thread {
    public static void main(String[] args) throws InterruptedException {
        CountTenThread ct = new CountTenThread();
        ct.start();
        for(int i=0; i<10; i++){
            System.out.println("main:i= "+i);
            sleep(500);
        }
    }

    @Override
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("run:i= "+i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
