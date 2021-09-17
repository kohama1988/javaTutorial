package Basic;
public class Recursion {
    public static void main(String[] args) {
        //方法地柜包含了一种隐式的循环，它会重复执行某段代码，但这种重复执行无需循环控制
        //地柜一定要向已知的方向递归，否则这种递归就变成了无穷递归，类似于死循环
        Recursion test = new Recursion();
        System.out.println(test.getSum(100));
        System.out.println(test.f(10));
        
    }

    public int getSum(int i){
        if(i==1){
            return 1;
        }else{
            return i*getSum(i-1);
        }
    }

    // f(0)=1, f(1)=4, f(n+2)=2*f(n+1)+f(n)
    public int f(int n){
        if(n==0){
            return 1;
        }else if(n==1){
            return 4;
        }else{
            return 2*f(n-1) + f(n-2);
        }
    }
}
