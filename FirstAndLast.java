public class FirstAndLast {
    public static void main(String[] args) {
        int[] arr= {2,3,5,9,14,14,14,14,16,18};

        binaryS(arr,14);

    }

    static int[] binaryS(int[] arr, int target){

        int ans[] = new int[]{-1,-1};

        int start= search(arr, target, true);

        int end= search(arr, target, false);

        ans[0]= start;
        ans[1] = end;

        System.out.println(ans[0]);
        System.out.println(ans[1]);

        return ans;

    }

    static int search(int[] arr, int target, boolean findStartindex){
        int res = 0;
        int s = 0;
        int e = arr.length;

        while(s<=e) {
            int mid = s+(e-s)/2;//this one is better

            if(arr[mid]>target) {
                e=mid;
            } else if (arr[mid]<target) {
                s=mid;
            }
            else{
                res = mid;
                if(findStartindex){
                    e = mid-1;
                }
                else {
                    s=mid+1;
                }
            }
        }
        // pootential ans
        return res;
    }
}
