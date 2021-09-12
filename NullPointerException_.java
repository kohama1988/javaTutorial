import java.util.Arrays;

public class NullPointerException_ {
    public static void main(String[] args) {
        // 空指针异常：NullPointerException
        int[] arr = new int[]{1,2,3,4,5};
        // System.out.println(Arrays.toString(arr));
        // arr = null;
        // System.out.println(arr[0]); // error

        int[] arr1 = new int[4];
        System.out.println(arr1[0]);

        int[][] arr2 = new int[4][];
        System.out.println(arr2[0]);
        // System.out.println(arr2[0][0]);// error

        String[] s = new String[]{"AA","BB","CC"};
        s[0] = null;
        // System.out.println(s[0].toString()); //error


    }
}
