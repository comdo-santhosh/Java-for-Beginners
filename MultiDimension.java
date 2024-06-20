

public class MultiDimension {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        for(int[]a:arr){
            for(int e : a){
                System.out.print(e+" ");
            }
            System.out.println();
        }

        System.out.println(arr[1][2]);   // Multi-dimension array has one than one row and one columns

        // printing random values in MultiD arrays
        int[][] a = new int[4][4];
        for(int i = 0; i <a.length; i++){
            for (int j = 0; j <a[i].length; j++){
                a[i][j]  = (int)(Math.random()*100);
            }
        }

        for(int[] array:a){
            for(int elements : array){
                System.out.print(elements+" ");
            }
            System.out.println();
        }

    }
}
