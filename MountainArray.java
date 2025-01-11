public class MountainArray {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5,3,1};
        int target  = 3;
        int max = peek(arr);
        decision(arr,max,target);

    }

    static void decision(int[] arr, int max, int target){
        int start;
        int end;

        if(max>target){
            start = 0;
            end = max;
            System.out.println(binarySearch(arr,target,start,end));
        }
        else{
            start = max+1;
            end = arr.length-1;
            System.out.println("else");
            System.out.println(binarySearch(arr,target,start,end));
        }
    }
    static int peek(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while (start < end) {

            int mid = start+(end-start) / 2;

            if (arr[mid] > arr[mid+1]) {
                end = mid;

            } else{

                start = mid + 1;

            }

        }
        return start;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {

// find the middle element

            int mid = (start + end) / 2;

            if (target < arr[mid]) {
                end = mid - 1;

            } else if (target > arr[mid]) {

                start = mid + 1;

            } else {
                return mid;
            }

        }
        return -1;
    }
}
