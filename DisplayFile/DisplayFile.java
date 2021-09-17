package DisplayFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DisplayFile {
    public static void main(String[] args) {
        for(String filename:args){
            System.out.println("文件名: "+ filename + "=======");
            try{
                BufferedReader reader = new BufferedReader(new FileReader(filename));
                while(true){
                    String line = reader.readLine();
                    if(line==null){
                        break;
                    }
                    System.out.println(line);
                }
                reader.close();
            }catch(FileNotFoundException e){
                System.out.println("没有找到文件: " + e);
                e.printStackTrace(); //显示callstack，可以看到是哪个方法中抛出的异常
            }catch(IOException e){
                System.out.println("I/O错误: " + e);
            }
        }
    }
}
