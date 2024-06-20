

public class JaggedArray {
    public static void main(String[] args) {
        int[][]numbs = {{1,7,5},{4,8,1,9},{5,12,6},{2,7},{-12,6,9},{4,17,2,6,14}};

        // Jagged array in not same row and column  -->  row != column
        for(int[] arr:numbs){
            for(int a:arr){
                System.out.print(a+" ");
            }
            System.out.println();
        }
        // i want 5 rows and each row has different count of numbers
        // for example first row has 3 and second row has 4 number and 3rd row as 4 likewise;


        int[][] arr = new int[5][];

        for(int i = 0 ; i < arr.length; i++){
//            int random =(int) (Math.random()  * 5);
            arr[i] = new int[(int)(Math.random()*10)];
            for(int j = 0;  j < arr[i].length; j++){
                arr[i][j] = (int) (Math.random()* 100);
            }
        }

        for(int[] a:arr){
            for(int e:a){
                System.out.print(e+" ");
            }
            System.out.println();
        }
    }
}
