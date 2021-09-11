public class ArrayCopy {
    public static void main(String[] args) {
        // arr1 = arr2 操作时 2者参照的地址值相同，所以修改arr2值时也会修改arr1，
        // 所谓的 浅拷贝
        int[] arr1 = new int[]{1,3,5,7,9};
        int[] arr2;
        arr2 = arr1;

        // 深拷贝
        int[] arr3 = new int[arr1.length];
        for(int i=0; i<arr1.length; i++){
            arr3[i] = arr1[i];
        }

        String[] a = new String[]{"AA", "BB", "CC", "DD", "EE"};
        // 数组的复制
        String[] a1 = new String[a.length];
        for(int i=0; i<a.length; i++){
            a1[i] = a[i];
        }

        // 数组的反转
        String[] a2 = new String[a.length];
        for(int i=0; i<a.length; i++){
            a2[i] = a[a.length-i-1];
        }
        System.out.println("Original: ");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("\n"+"Reversing: ");
        for(int i=0; i<a2.length; i++){
            System.out.print(a2[i]+" ");
        }

        
    }
}
