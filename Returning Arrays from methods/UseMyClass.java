package ExamplePack;

import java.util.Scanner;

public class UseMyClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int [] arr = new int [n];
        System.out.println("Enter Elements to sum:(only 5)");
        for(int i = 0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        MyClass obj1 = new MyClass();
        double [] res = obj1.calculate(arr);
        System.out.println("Sum= "+ res[0]);
        System.out.println("AVG= "+ res[1]);
    }
}
