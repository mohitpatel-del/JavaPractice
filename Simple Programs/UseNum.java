package ExamplePack;

import java.util.Scanner;

public class UseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j;
        System.out.println("Enter value of a:");
        i = sc.nextInt();
        System.out.println("Enter value of b:");
        j = sc.nextInt();

        Num obj = new Num();
        obj.setNum(i,j);
        System.out.println("Before swapping");
        obj.showNum();
        System.out.println();
        obj.swapNum();
        System.out.println("After Swap");
        obj.showNum();

    }
}
