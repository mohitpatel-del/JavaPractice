
public class TypeConversions {
    public static void main(String [] args){
        short num1 = 5;
        byte num2 = 5;
        char num3 = 5;

        short res = (byte)(num1+num2+num3);

        System.out.println(res);
    }
}
