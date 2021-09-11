import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        //输出40以内的6位随机数，要求6个数不可以重复
        Random rnd = new Random();
        int[] arr = new int[6];
        for(int i=0; i<arr.length; i++){
            arr[i] = rnd.nextInt(40)+1;
            for(int j=0; j<i; j++){
                if(arr[i] == arr[j]){
                    i--;
                    break;
                }
            }
        } 
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        
        
    }
}
 