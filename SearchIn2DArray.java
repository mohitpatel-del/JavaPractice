import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6,7,8},
                {9,10},
                {11,12,13,14}
        };
        int[] res = search(arr,13);
        System.out.println(Arrays.toString(res));
        System.out.println(arr[res[0]][res[1]]);
    }
    static int[] search(int[][]arr,int target){
        int[] res = new int[2];
        for(int i =0;i<arr.length;i++){
            for(int j =0; j<arr[i].length;j++){
                if(arr[i][j]==target){
                    res[0]=i;
                    res[1]=j;
                    break;
                }
            }
        }
        return res;
    }
}
