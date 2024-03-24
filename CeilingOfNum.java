public class CeilingOfNum {
    public static void main(String[] args) {
        int[] arr = {5,7,9,11,15,20,25,30,35,40,45};

        System.out.println(celing(arr,39));

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
            }else if (arr[mid]>target) {
                e=mid;
            } else if (arr[mid]<target) {
                s=mid;
            }
        }

        return arr[res];
    }
}
