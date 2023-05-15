package ExamplePack;

public class Result {
    private String res = "Pass";
    private int per = 0;

    public Result(String r){
        res = r;
    }
    public Result(int r){
        per = r;
    }

    public String showRes(){
        return res;
    }
    public int showPer(){
        return per;
    }

}
