package Circle;

public class Circle {
    private int radius;
    public Circle(int r){
        radius = r;
    }
    public double calcArea(){
        return Math.PI*(Math.pow(radius,2));
    }
    public double calcCircumference(){
        return 2*Math.PI*radius;
    }
}
