public class Sorting {
    public static void main(String[] args) {
        int arr[] = {19, 6 , 5, 9, 2, 27};
        int sorted[] = insertionSort(arr);
        for(int i =0; i< sorted.length; i++){
            System.out.println(sorted[i]);
        }
    }


    /////////////Quick Sort////////////////////////////////////////////
    static int[] quickSort(int arr[], int l, int h){
        if(l<h){
            int pivot = partition(arr, l, h);
            quickSort(arr,l,pivot);
            quickSort(arr,pivot+1, h);
        }
        return arr;
    }

    static int partition(int arr[], int l, int h){
        int pivot =arr[l];
        int i = l;
        int j = h;
        while(i<j){
            while(arr[i]<= pivot) i++;
            while(arr[j] > pivot) j--;
            if(i<j){
                swap(arr, i,j);
            }
        }
        swap(arr,l,j);
        return j;
    }
////////////////////////////////////////////////////////////////////////////////////////////////////

    static int[] selectionSort(int arr[]){
        for(int i = 0; i< arr.length -1; i++){
            int min = i;
            for(int j = i+1; j< arr.length; j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            if(min!=i){
                swap(arr, i,min);
            }
        }

        return arr;
    }
    ///////////////////////////////////////////////////

    static int[] insertionSort(int arr[]){
        for(int i =1; i< arr.length; i++){
            int temp = arr[i];
            int j;
            for(j =i-1; j>= 0 && arr[j]> temp; j--){
                arr[j+1] = arr[j];
            }
            arr[j+1] = temp;
        }
        return arr;
    }

    ////////////////////////////////////////////////////

    

    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
