package Basic;

// class PrimeNumberTest{
//     public static void main(String[] args){
//         //输出100以内的所有质数
//         for(int i=2; i<1000; i++){
//             boolean isFlag = true;
//             for(int j=2; j<i; j++){
//                 if(i%j == 0){
//                     isFlag = false;
//                 }
//             }
//             if(isFlag){
//                 System.out.println(i);
//             }
//         }
//     }
// }

// 优化后
class PrimeNumberTest{
    public static void main(String[] args){
        //输出100以内的所有质数
        long start = System.currentTimeMillis();
        int count = 0;
        
        for(int i=2; i<1000000; i++){
            boolean isFlag = true;
            for(int j=2; j<=Math.sqrt(i); j++){
                if(i%j == 0){
                    isFlag = false;
                    break;
                }
            }
            if(isFlag){
                // System.out.println(i);
                count++;
            }
        }
        System.out.println("个数为:"+count);
        long end = System.currentTimeMillis();
        System.out.println("所用时间为:"+(end-start)+"ms");
    }
}