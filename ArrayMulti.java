public class ArrayMulti {
    public static void main(String[] args) {
        // 2维数组的声明，初始化
        int[][] arr = new int[][]{{1,2,3},{4,5,6},{7,8}};
        // int[][] arr1 = new int[3][2];

        // 数组元素的调用
        System.out.println(arr[0][0]);

        // 获取数组的长度
        System.out.println(arr.length);
        System.out.println(arr[0].length);
        System.out.println("**********************");

        // 遍历2维数组
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        // 数组元素的默认初始化
    }
}
