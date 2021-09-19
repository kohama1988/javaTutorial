package InheritTest1;

public class KidsTest {
    public static void main(String[] args) {
        Kids kid = new Kids(12);
        kid.PrintAge();
        kid.setSex(1);
        kid.setSalary(100);
        System.out.println(kid.getYearsOld());
        System.out.println(kid.getSex());
        System.out.println(kid.getSalary());
        kid.employeed();
        kid.manOrWoman();
    }
}
