import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args){
        // 一维数组的声明和初始化
        // 如何调用数组的指定文职的元素
        // 静态初始化
        int[] ids;
        ids = new int[]{1,2,3,4};
        // System.out.println(ids[3]);
        // 动态初始化
        String[] names = new String[5];
        names[2] = "kohama";
        // System.out.println(names[0]);

        
        // 如何获取数组的长度
        System.out.println(names.length);

        // 如何遍历数组
        for(int i=0; i<names.length; i++){
            System.out.println(names[i]);
        }
        System.out.println("************************");

        // 数组元素的默认初始化
        // 整数型：0
        // 浮点型：0.0
        // char型: 0或者'\u0000'
        // 布尔型：false
        // 引用数据类型： null
        int[] arr = new int[4];
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("************************");

        short[] arr1 = new short[4];
        for(int i=0; i<arr.length; i++){
            System.out.println(arr1[i]);
        }
        System.out.println("************************");

        float[] arr2 = new float[4];
        for(int i=0; i<arr.length; i++){
            System.out.println(arr2[i]);
        }
        System.out.println("************************");

        char[] arr3 = new char[4];
        for(int i=0; i<arr.length; i++){
            System.out.println(arr3[i]);
        }
        System.out.println("************************");

        boolean[] arr4 = new boolean[4];
        for(int i=0; i<arr.length; i++){
            System.out.println(arr4[i]);
        }
        System.out.println("************************");
        // 数组的内存解析

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("你输入的是："+ n);
        

    }
}
