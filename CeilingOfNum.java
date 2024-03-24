public class CeilingOfNum {
    public static void main(String[] args) {
        int[] arr = {4,5,7,9,11,15};

        System.out.println(celing(arr,3));

    }
    static int celing(int[] arr,int target) {
        int res = -1;
        int s = 0;
        int e = arr.length-1;
        for(int i =s; i<e;i++){
            int mid = s+(e-s)/2;
            if(arr[mid]==target){
                res = mid;
                break;
            } else if ((arr[mid]<target && arr[mid+1]>target)) {
                res = mid+1;
            } else if (arr[mid]>target) {
                e=mid;
            } else if (arr[mid]<target) {
                s=mid;
            }

            if(e==i) {
                res=s;
            }
        }

        return arr[res];
    }
}
