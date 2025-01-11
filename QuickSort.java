public class QuickSort{
    public static void main(String args[]){
        int arr[] = {22,15,17,54,29,40};
        int sorted[] = sort(arr, 0, arr.length-1);
        for(int i =0; i< arr.length; i++){
            System.out.println(sorted[i]);
        }
    }

    static void swap(int arr[], int ele1, int ele2){
        int temp = arr[ele1];
        ele1 = arr[ele2];
        ele2 = temp;
    }

    static int partitioning(int arr[], int l, int h){
        int i = l;
        int j = h;
        int pivot = arr[l];

        while(i< j){
            while(arr[i]<= pivot) i++;
            while(arr[j]>pivot) j--;
            if(i < j){
                swap(arr,i,j);
            }
        }
        swap(arr,l,j);
        return j;
    }
    static int[] sort(int arr[], int l, int h){
        if(l< h){
            int piv = partitioning(arr, l, h);
            sort(arr, l,piv );
            sort(arr, piv+1, h);
        }
        return arr;
    }
}