package Basic;
import java.util.Random;

public class ArrayMaxMinAve {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rnd = new Random();
        // 为数组赋值
        for(int i=0; i<arr.length; i++){
            arr[i] = rnd.nextInt(90)+10;
        }
        
        // 遍历数组
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        // 求出Max值
        int maxValue = 0;
        for(int i=0; i<arr.length; i++){
            if(maxValue<arr[i]) maxValue = arr[i];
        }
        System.out.println("arr中的Max为：" + maxValue);

        // 求出Min值
        int minValue = 100;
        for(int i=0; i<arr.length; i++){
            if(minValue>arr[i]) minValue = arr[i];
        }
        System.out.println("arr中的Min为：" + minValue);

    }
}
