package SynchronizeTest;

public class Test extends Thread {
    SynchronizeTest st;
    public Test(SynchronizeTest st){
        this.st = st;
    }
    
    @Override
    public void run(){
        while(true){
            st.addMoney(100);
            st.addMoney(-100);
        }
    }
    public static void main(String[] args) {
        SynchronizeTest st = new SynchronizeTest();
        new Test(st).start();
        new Test(st).start();
    }
}
