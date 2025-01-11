import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter Size of the Array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter The elements of the Array");
        for(int i =0; i<size;i++){
            System.out.println("Enter Elment no. "+ i);
            arr[i] = sc.nextInt();
            if(i>=1){
                if(arr[i]<arr[i-1]){
                    System.out.println("Invalid input: Array Should be in sorted order.");
                    break;
                }
            }
        }
        System.out.println("Enter the Target number to find: ");
        int target = sc.nextInt();
        int res = binaryS(arr,target);
        System.out.println("Index = "+ res+"   element = "+ arr[res]);


    }


    static int binaryS(int[] arr, int target){
        int res = 0;
        int s = 0;
        int e = arr.length;

//        for(int i = s; i<e;i++){
//            int mid = s+(e-s)/2;//this one is better
//
//            if(arr[mid]==target){
//                res = mid;
//                break;
//            } else if(arr[mid]>target) {
//                e=mid;
//            } else if (arr[mid]<target) {
//                s=mid;
//            }
//        }
        while(s<e) {
            int mid = s+(e-s)/2;//this one is better

            if(arr[mid]==target){
                res = mid;
                break;
            } else if(arr[mid]>target) {
                e=mid;
            } else if (arr[mid]<target) {
                s=mid;
            }
        }
        return res;
    }
}
