import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,6,5,8,11};
        int target = 14;

        int[] result = twosum(arr,target);

        for(int i = 0; i< result.length; i++){
            System.out.println(result[i]);
        }
    }

    public static int[] twosum(int arr[], int target){
        Map<Integer, Integer> hash = new HashMap<Integer,Integer>();
        int ans[] = new int[2];
        for(int i = 0; i< arr.length; i++){
            if(hash.containsKey(target-arr[i])){
                ans[0] = i;
                ans[1] = hash.get(target - arr[i]);
                return ans;
            }
            hash.put(arr[i],i);
        }
        return ans;
    }
}
