package ExamplePack;

public class Num {
    private int a,b;
    public void setNum(int i,int j){
        a = i;
        b = j;
    }
    public void swapNum(){
        int temp = 0;
        temp  = a;
        a = b;
        b = temp;
    }
    public void showNum(){
        System.out.println("a = "+ a+" b = "+ b);
    }
}
