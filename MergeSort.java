public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {22, 15, 17, 54, 29, 40};
         int sorted[] = sort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
             System.out.println(sorted[i]);
        }
        System.out.println(binaryRec(arr, 0,arr.length-1,29));
    }

    static int binaryRec(int arr[], int low, int high, int target){
        int s = low;
        int e = high;
        int mid = (s+e)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid]< target){
            return binaryRec(arr, mid+1,high, target);
        }else{
            return binaryRec(arr, s, mid-1, target);
        }
    }

    static int search(int arr[], int ele){
        int ans = 0;
        int i = 0;
        int j = arr.length-1;

        for(int k = i; k< j; k++){
            int mid = (0+arr.length)/2;
            if(ele == arr[mid]){
                ans = mid;
                return ans;
            }else if(ele> arr[mid]){
                k = arr[mid]+1;
            }else {
                j = arr[mid];
            }
        }


        return ans;
    }

    static int[] sort(int arr[], int l, int h) {
        if (l < h) {
            int mid = (l + h) / 2;
            sort(arr, l, mid);
            sort(arr, mid + 1, h);
            merge(arr, l, mid, h);
        }
        return arr;
    }

    static void merge(int arr[], int l, int mid, int h){
        int i  = l;
        int j = mid+1;
        int k = l;
        int b[] = new int[h+1];
        while(i<= mid && j<= h){
            if(arr[i] < arr[j]){
                b[k] = arr[i];
                i++;
            } else{
                b[k] = arr[j];
                j++;
            }
            k++;
        }
        if(i>mid){
            while(j<= h){
                b[k] = arr[j];
                j++;
                k++;
            }
        }else{
            while(i<=mid){
                b[k] = arr[i];
                i++;
                k++;
            }
        }
        for( k = l; k<= h; k++){
            arr[k] = b[k];
        }
    }
}