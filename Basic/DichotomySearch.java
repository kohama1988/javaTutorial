package Basic;
public class DichotomySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{-98,-34,2,34,54,66,79,105,210,222};
        int dest = 210;
        int head = 0; // 初始的首索引
        int end = arr.length - 1; // 初始的末索引
        
        boolean isFlag = true;
        while(head<end){
            int middle = (head+end)/2;
            if(dest == arr[middle]){
                System.out.println("找到了指定的元素，位置为："+middle);
                isFlag = false;
                break;
            }else if(arr[middle] > dest){
                end = middle - 1;
            }else{
                head = middle + 1;
            }
        }
        if(isFlag){
            System.out.println("没找到指定的元素");
        }
    }
}
