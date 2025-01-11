public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {3,2,1}
        };
        System.out.println(maximumWealth(arr));

    }


    static int maximumWealth(int[][] arr){
        int max=0;
        int res= 0;

        for(int[] persn:arr){
            for(int value:persn){
                max+=value;
            }
            if(max>=res){
                res = max;
                max=0;
            }
        }
        return res;
    }
}
