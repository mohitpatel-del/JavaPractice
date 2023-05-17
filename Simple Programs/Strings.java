import java.util.Scanner;

public class Strings{

    public static void reverseString(StringBuilder str) {
        StringBuilder temp = new StringBuilder(" ");
        int count = 0;
        for(int i = str.length() - 1; i >= 0; i--) {
            temp.insert(count, str.charAt(i));
            count++;
        }
        System.out.println(temp);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        reverseString(str);
    }
}