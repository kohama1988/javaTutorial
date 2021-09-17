package Basic;
public class YanghuiTriangle {
    public static void main(String[] args) {
        // 声明初始化2维数组
        int[][] arr = new int[10][];

        // 元素赋值
        for(int i=0; i<arr.length; i++){
            arr[i] = new int[i+1];
            // 首末元素赋值
            arr[i][0] = arr[i][i] = 1;
            // 中间元素赋值
            if(i>1){
                for(int j=1; j<arr[i].length-1; j++){
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                }
            }
        }

        // 遍历元素
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
