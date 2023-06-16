package polymorphism;

public class Circle  extends Area{
    public static void Area(){
        System.out.println("Circle");
    }
    public void notStatic(){
        System.out.println("Non static Circle");
    }
}
