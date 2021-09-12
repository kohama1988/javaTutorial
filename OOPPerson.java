public class OOPPerson {
    public static void main(String[] args) {
        Person p = new Person();
        // p.eat();
        System.out.println(p);
        System.out.println(p.isMale);
    }
}

class Person{
    // 常用的权限修饰符：private, public, 缺省, protected
    // 属性（成员变量）加载到堆空间中 非static
    private String name;
    public int age;
    protected boolean isMale;

    public void eat(){
        System.out.println("人可以吃饭");
    }
    public void sleep(){
        System.out.println("人可以睡觉");
    }
    public void talk(String lang){
        int i = 0; // 局部变量，加载到栈空间中
        System.out.println("人可以说话，使用的是："+lang);
    }
}
