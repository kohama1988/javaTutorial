package Basic;
public class MethodArgs {
    public static void main(String[] args) {
        //可变个数形参的方法
        MethodArgs test = new MethodArgs();
        test.show(12);
        test.show("JAVA","C++");
    }

    public void show(int i){

    }

    public void show(String s){

    }
    // 可以传入多个字符串，也可以传入字符串的数组
    // 可变个参数形参必须传到末尾
    // 最多只能生成一个可变形参
    public void show(String...strs){
        for(String s:strs){
            System.out.println(s);
        }
    }
    // 错误, 不可以重载，Duplicate method show(String[]) in type
    // public void show(String[] s){
    //     //Duplicate method show(String[]) in type MethodArgsJava(67109219)
    // }
}
