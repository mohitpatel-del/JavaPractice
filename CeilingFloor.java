public class CeilingFloor {
    public static void main(String[] args) {

        int[] arr= {2,3,5,9,14,16,18};
        System.out.println(ceiling(arr,15));
        System.out.println(floor(arr,15));
        System.out.println(ceiling2(arr,18));

    }
    static int ceiling(int[] arr, int target){
        int s = 0;
        int e = arr.length;
        if(target>arr[arr.length-1]){
            return -1;
        }

        while(s<=e) {
            int mid = s+(e-s)/2;//this one is better

            if(arr[mid]==target){
                return target;
            } else if(arr[mid]>target) {
                e=mid-1;
            } else if (arr[mid]<target) {
                s=mid+1;
            }
        }
        return arr[s];
    }

    static int floor(int[] arr, int target){
        int s = 0;
        int e = arr.length;
        if(target<arr[0]){
            return -1;
        }

        while(s<=e) {
            int mid = s+(e-s)/2;//this one is better

            if(arr[mid]==target){
                return target;
            } else if(arr[mid]>target) {
                e=mid-1;
            } else if (arr[mid]<target) {
                s=mid+1;
            }
        }
        return arr[e];
    }

    static int ceiling2(int[] arr, int target){
        int s = 0;
        int e = arr.length-1;
        while(s<=e) {
            int mid = s+(e-s)/2;//this one is better

            if(arr[mid]>target) {
                e=mid-1;
            } else{
                s=mid+1;
            }
        }
        return arr[s%arr.length];
    }
    public char nextGreatestLetter(char[] letters, char target) {
        int s = 0;
        int e = letters.length-1;
        while(s<=e) {
            int mid = s+(e-s)/2;//this one is better

            if(letters[mid]>target) {
                e=mid-1;
            } else{
                s=mid+1;
            }
        }
        return letters[s%letters.length];
    }
}
