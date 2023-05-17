public class Bitplay{
    public static void main(String args[]) {
        int n = 10;//1010
        int pos = 3;

        int bitmask = 1<<pos;
        int newNum = (~bitmask) & n;
        System.out.println(newNum);
    }
}