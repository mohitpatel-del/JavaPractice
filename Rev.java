import java.util.Arrays;

public class Rev {
    public static void main(String[] args) {
        int[] arr ={1,8,0,6,5,3,5,13};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(isPresent(arr,3));
        System.out.println(linearSearch(arr,3));
        System.out.println(strSearch("Hello",'o'));



    }
    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

    }

    static void reverse(int[] arr){
        int bound = arr.length-1;
        int init = 0;
        for(int i = 0; i<arr.length; i++){
            if(init >=bound){
                break;
            }
            else{
                swap(arr,init,bound);
                init++;
                bound--;
            }
        }
    }
    static boolean isPresent(int[] arr,int num){
        boolean result = false;
        for (int ele:arr) {
            if (ele == num){
                result = true;
                break;
            }

        }
        return result;
    }
    static int linearSearch(int[] arr, int target){
        int index = 0;
        for (int i =0; i<arr.length;i++) {
            if (arr[i]== target){
                index = i;
                break;
            }
        }
        return index;
    }
    static boolean strSearch(String str,Character ch){
        boolean result = false;
        for(Character s:str.toCharArray()){
            if(s==ch){
                result=true;
                break;
            }
        }
        return result;
    }
}
