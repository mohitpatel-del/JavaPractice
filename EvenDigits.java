public class EvenDigits {
    public static void main(String[] args) {

        int[] arr = {10,13,990,1250,9,23,467};

        System.out.println(findnumbers2(arr));//res = 4


    }
    static int findNumbers(int[] arr){
        int count =0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i]>9&& arr[i]<99){
                count++;
            } else if(arr[i]>999&& arr[i]<9999){
                count++;
            } else if (arr[i]>99999&& arr[i]<999999) {
                count++;
            }
        }
        return count;
    }

    static int findnumbers2(int[] arr){
        int count = 0;
        for(int i:arr){
            if(even(i)){
                count++;
            }
        }
        return count;
    }

    static  boolean even(int i){
        if(digits(i)%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    static int digits(int n){
        int ans = 0;
        while (n>0){
            ans++;
            n = n/10;
        }
        return ans;
    }
}
