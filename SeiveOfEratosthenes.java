import java.util.Arrays;

public class SeiveOfEratosthenes {
    public static void main(String[] args) {
        int n = 20;
//        boolean [] res  = isPrime(n);
//        for(int i = 0; i<res.length;i++){
//            System.out.println("" + i+ " = "+ res[i]);
//        }
//        System.out.println(gcd(60,12));
//       System.out.println(fastPower(6,3));
//        System.out.println(sumNaturals(5));
//        System.out.println(isPalin("lhehl", 0,4));

        int board[][] = new int[4][4];
        int arr[] = {19, 6 , 5, 9, 2, 27};
        int sorted[] = quick2(arr, 0, arr.length-1);
        for(int i =0; i< sorted.length; i++){
            System.out.println(sorted[i]);
        }

    }
        static int N = 4;
    static void swap(int i, int j, int arr[]){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int[] quick2(int arr[], int l, int h){
        if(l < h){
            int pivot  = patrtition(arr, l, h);
            quick2(arr, l,pivot);
            quick2(arr, pivot+1, h);
        }
        return arr;
    }

    static int patrtition(int arr[], int l, int h){
        int pivot = arr[l];
        int i = l;
        int j = h;
        while(i< j){
            while(arr[i] <= pivot) i++;
            while(arr[j] > pivot) j--;
            if(i < j){
                swap(i,j,arr);
            }
        }
        swap(l,j,arr);
        return j;
    }


    static int[] selectionSort(int arr[]){

        for(int i =0; i< arr.length-1; i++){
            int min = i;
            for(int j = i+1; j< arr.length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            if(min!=i){
                int temp  = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }

        for(int i =0; i< arr.length; i++){
            System.out.println(arr[i]);
        }

        return arr;
    }

    static int[] insertionSort(int arr[]){
        for(int i =1; i< arr.length; i++){
            int temp = arr[i];
            int j;
            for(j = i-1; j>= 0 && arr[j] > temp; j--){
                arr[j+1] = arr[j];
            }
            arr[j+1] = temp;
        }
        for(int i =0; i< arr.length; i++){
            System.out.println(arr[i]);
        }


        return arr;
    }


    static int[] bubbleSort(int arr[]){

        for(int i =0; i< arr.length-1; i++){
           for(int j = 0; j< arr.length-i-1; j++){
               if(arr[j] > arr[j+1]){
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }
           }
        }
        for(int i =0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
        return arr;
    }

    static int rainWaterTrapping(int arr[]){//[3,5,7,4,3,2]
        int water = 0;
        int left[] = new int[arr.length];
        int right[] = new int[arr.length];
        int max=0;
        for(int i =0; i< arr.length; i++){
            if(arr[i] > arr[max]){
                left[i] = arr[i];
                max = i;
            }else{
                left[i] = arr[max];
            }
        }
        int max2 = 0;
        for(int i =arr.length-2; i>= 0; i--){
            if(i+1 == arr.length-1){
                right[i+1] = arr[i+1];
            }
            if(arr[i] > arr[max2]){
                right[i] = arr[i];
                max2 = i;
            }else{
                right[i] = arr[max2];
            }
        }
        for(int i =0; i< arr.length; i++){
            water+=Math.min(left[i], right[i]) - arr[i];
        }


        return water;
    }

    static int stocksProfitPro(int arr[]){
        int maxprof = 0;
        for(int i  = 1; i<arr.length; i++){
            if(arr[i]> arr[i-1]){
                maxprof += (arr[i] - arr[i-1]);
            }
        }
        return maxprof;

    }

    static int stocksProfit2(int arr[]){
        int minEle = arr[0];
        int maxprof = 0;
        for(int i  = 0; i<arr.length; i++){
            minEle = Math.min(arr[i], minEle);
            int profit = arr[i]  - minEle;
            maxprof = Math.max(profit, maxprof);
        }
        return maxprof;

    }


    static int stocksProfit(int arr[]){
        int[] auxarr = new int[arr.length];
        int maxEle = 0;
        int curr = 0;
        for(int i  = arr.length-1; i>=0; i--){
                curr = i;

            if(arr[curr]> arr[maxEle]){
                auxarr[i] = arr[curr];
                maxEle = curr;
            }
            else{
                auxarr[i] = arr[maxEle];
            }
        }
        int maxdiff = 0;
        int currdiff = 0;
        for(int i = 0; i< arr.length; i++){
            currdiff = auxarr[i] - arr[i];
            if(currdiff >   maxdiff){
                maxdiff = currdiff;
            }
        }
        return maxdiff;
    }

    static int kadensAlgo(int arr[]){
        int maxsum = -1000;
        int currsum = 0;
        for(int i =0; i< arr.length; i++){
                currsum = currsum + arr[i];
            if(currsum > maxsum){
                maxsum = currsum;
            }

            if(currsum < 0){
                currsum = 0;
            }
        }

        return maxsum;
    }

    static int majorityIndex(int arr[]){
        int result = 0;
        int ansIndex = 0, count = 0;
        for(int i =0; i< arr.length; i++){
            if(arr[i] == arr[ansIndex]){
                count++;
            }
            else{
                count--;
            }
            if(count ==0){
                ansIndex = i;
                count = 1;
            }
        }
        if(ansIndex>(arr.length/2)){
            result = ansIndex;
        }

        return arr[result];
    }

    static boolean isSafe(int board[][], int row, int col){
        for(int i = 0; i<col; i++){
            if(board[row][1] == 1){
                return false;
            }
        }
        for(int i = row, j = col; i>=0 && j>=0; i--,j--){
            if(board[i][j] == 1){
                return false;
            }
        }
        for(int i = row, j = col; j>=0 && i<N; i++, j--){
            if(board[i][j] == 1){
                return false;
            }
        }
        return true;
    }
    static boolean nQueens(int board[][], int col){
        if(col >= N){
            return true;
        }
        for(int i = 0; i< N; i++){
            if(isSafe(board,i,col)){
                board[i][col] = 1;
                if(nQueens(board,col+1)){
                    return true;
                }
                board[i][col] = 0;
            }
        }
        return false;
    }

    static boolean isPalin(String s, int l, int r){
        if(l>=r){
            return true;
        }
        if(s.charAt(l) != s.charAt(r)){
            return false;
        }
        return isPalin(s, l+1, r-1);
    }

    static int josephus(int n, int k){
        if(n == 1){
            return 0;
        }
        return (josephus(n-1, k)+ k)%n;
    }

    static int matrixNM(int n, int m){
        int res = 1;
        if(n == 1 || m == 1){
            return res;
        }
        return matrixNM(n,m-1)+matrixNM(n-1,m);
    }

    static int pow(int a, int b){
//        int result = 1;
//        if(b == 0){
//            return result;
//        }
//
//        return a*(pow(a, b-1));
        int res = 1;
        while(b>0){
            if((b&1) != 0){
                res = res*a;
            }
            a = a*a;
            b  = b>>1;
        }
        return res;
    }

    static int sumNaturals(int n){
        if(n ==1){
            return 1;
        }
        return n+ sumNaturals(n-1);
    }

    static int fastPower(int a, int b){
        int res = 1;
        while(b>0){
            if((b&1)!=0){
                res = res *a;
            }
            a = a*a;
            b = b>>1;
        }
        return res;
    }

    static int gcd(int a, int b){
        if (b == 0){
            return a;
        }
        return gcd(b,a%b);
    }
    static boolean[] isPrime(int n){
        boolean[] result = new boolean[n+1];
        Arrays.fill(result, true);
        result[0] = false;
        result[1]= false;

        for(int i = 2; i*i<= n; i++){

            for(int j = i*2; j<= n; j+=i){
                result[j] = false;
            }
        }


        return result;
    }
}
