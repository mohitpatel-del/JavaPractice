public class Heap {
    public static void main(String[] args) {
        int [] arr = new int[11];
        arr[0] = Integer.MAX_VALUE;
        arr[1] = 50;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 10;
        arr[5] = 5;
        arr[6] = 20;
        arr[7] = 30;
        arr[8] = 60;
        insert(arr, 8, 45);

        for(int i : arr){
            System.out.println(i);
        }
    }

    static void swap(int arr[], int ele1, int ele2) {
        int temp = arr[ele1];
        arr[ele1] = arr[ele2];
        arr[ele2] = temp;
    }


    static void insert(int [] arr, int n, int value){
        n=n+1;
        arr[n] = value;
        int i = n;
        while(i>1){
            int parent = i/2;
            if(arr[parent] < arr[i]){
                swap(arr,parent, i);
                i=parent;
            }
            else{
                return;
            }
        }
    }
}
