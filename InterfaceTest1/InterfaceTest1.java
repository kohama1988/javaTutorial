package InterfaceTest1;

import java.io.FileNotFoundException;
import java.io.FileReader;

interface DebugPrint{
    void debugPrint();
}

class MyNumber implements DebugPrint{
    int a;
    public MyNumber(int a){
        this.a = a;
    }

    @Override
    public void debugPrint(){
        System.out.println("MyNumber的实例: a的值是 " + a);
    }
}

class MyFileReader extends FileReader implements DebugPrint{
    String filename = null;
    public MyFileReader(String filename) throws FileNotFoundException{
        super(filename);
        this.filename = filename;
    }

    @Override
    public void debugPrint(){
        System.out.println("MyFileReader的实例: 文件名是:" + filename);
    }
}

public class InterfaceTest1 {
    public static void main(String[] args) throws FileNotFoundException {
        MyNumber num = new MyNumber(123);
        num.debugPrint();
        MyFileReader reader = new MyFileReader("InterfaceTest1.java");
        reader.debugPrint();
    }
}
