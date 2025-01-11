public class CeilingOfNum {
    public static void main(String[] args) {
        int[] arr = new int[]{8,10,13,15,17};
        int ans = searchInsert(arr,11);

        System.out.println(arr[ans]);

    }
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length -1;
        while(start <= end)
        {
            int mid = start + (end - start )/2;
            if(nums[mid] == target )
                return mid;
            else if(nums[mid] < target)
                start = mid+1;
            else
                end = end-1;
        }
        return start ;
    }
}
