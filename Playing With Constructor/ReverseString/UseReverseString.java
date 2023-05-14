package ExamplePack;

import java.util.Scanner;

public class UseReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to reverse");
        String s = sc.nextLine();
        ReverseString obj1 = new ReverseString(s);
        System.out.println("Reversed String = "+ obj1.reverse());
    }
}
