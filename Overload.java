public class Overload {
    public static void main(String[] args) {
        Overload test = new Overload();
        test.getSum(10, 20);
        test.getSum("sdf",7);
    }
    // 看方法名和参数列表是否一致
    public void getSum(int i, int j){
        System.out.println(i+j);
    }
    public void getSum(double d1, double d2){
        System.out.println(d1+d2);
    }
    public void getSum(String s, int i){
        System.out.println(s+i);
    }
}
