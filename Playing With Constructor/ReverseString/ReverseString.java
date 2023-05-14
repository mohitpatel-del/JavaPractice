package ExamplePack;

public class ReverseString {
    private String orignal;
    private String reverse="";

    public ReverseString(String s){
        orignal = s;
    }
    public String reverse(){
        char ch;
        for(int i = orignal.length()-1; i>=0; i--){
            ch = orignal.charAt(i);
            reverse+=ch;
        }
        return reverse;
    }
}
