package ClassTest1;

public class CustomerTest {
    public static void main(String[] args) {
        Customer cust = new Customer("Jane","Smith");
        Account acct = new Account(100, 2000, 0.0123);
        cust.setAccount(acct);
        acct.deposit(100);
        acct.withdraw(960);
        // acct.withdraw(2000);
        System.out.println("Name: "+cust.getFristName()+ ", 余额:"+acct.getBalance());

    }
}
