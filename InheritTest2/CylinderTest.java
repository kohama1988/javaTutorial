package InheritTest2;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cl = new Cylinder();
        cl.setRadius(2.2);
        cl.setLength(3.1);
        double volume = cl.findVolume();
        double area  = cl.findArea();
        System.out.println("AREA="+area+", VOLUME="+volume);
    }
}
