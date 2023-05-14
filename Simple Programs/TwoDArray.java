
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows,cols;
        System.out.println("Enter no of rows:");
        rows= sc.nextInt();
        System.out.println("Enter no of columns:");
        cols = sc.nextInt();
        int sum =0;
        int [][] arr = new int[rows][cols];

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.println("Enter number for "+(i+1)+" row and "+(j+1)+" column");
                arr[i][j] = sc.nextInt();
                sum+= arr[i][j];
            }
        }

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("Sum = "+ sum);
        System.out.println("Avg = "+ (float) sum/12);
        sc.close();

    }
}
