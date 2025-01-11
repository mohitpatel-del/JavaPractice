import java.util.Scanner;

public class Matrix{
    public static void main(String[] args) {
        int[][] arr2d = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<arr2d.length; i++){
            for(int j = 0; j<arr2d[i].length;j++){
                arr2d[i][j] = sc.nextInt();
            }
        }
        for (int[] rows : arr2d) {
            for (int col : rows) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
