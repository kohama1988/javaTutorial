package SynchronizeTest;

public class SynchronizeTest {
    private int value=0;
    public synchronized void addMoney(int money){
        int currentValue = value;
        System.out.println(Thread.currentThread()+"进入了addMoney");
        value += money;
        if(currentValue+money != value){
            System.out.println(Thread.currentThread() + "出现了不一致");
            System.exit(-1);
        }
        System.out.println(Thread.currentThread()+"出了addMoney");
    }
}
