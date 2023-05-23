package ExamplePack;

public class MyClass {
    public double[] calculate(int []brr){
        int sum = 0;
        double[] result = new double[2];
        for(int x:brr){
            sum+=x;
            result[0] = sum;
            result[1] = (double) sum/brr.length;
        }
        return  result;
    }
}
