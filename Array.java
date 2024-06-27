import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // array is group of elements
        int arr[] = {1,2,3,4,5};
        int arr1[] = new int[5];
        System.out.print(arr[0]+" ");
        System.out.print(arr[1]+" ");
        System.out.print(arr[2]+" ");
        System.out.print(arr[3]+" ");
        System.out.println(arr[4]);
        arr[2] = 7;
        System.out.println(arr[2]);

        for(int e : arr){
            System.out.print(e+" ");
        }
        System.out.println();
        // initially all the elements are zero
        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        // now adding random number to the array
        for(int i = 0 ; i < arr1.length; i++){
            arr1[i] = (int) (Math.random() * 100);
        }
        for(int e : arr1){
            System.out.print(e+" ");
        }
        System.out.println();
        // Using Arrays class we can call all the element in the single line

        System.out.println("Arr length = "+arr.length);
        System.out.println("Arr1 length = "+arr1.length);
        Arrays.sort(arr);
        Arrays.sort(arr1);
        System.out.println( Arrays.hashCode(arr));
        System.out.println(Arrays.hashCode(arr1));
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        int arr2[] = new int[10];
        System.arraycopy(arr1,0,arr2,0,arr1.length);
        System.arraycopy(arr,0,arr2,0,arr.length);
        System.out.println(Arrays.toString(arr2));
    }
}
