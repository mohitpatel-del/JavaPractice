package polymorphism;

public class Run {
    public static void main(String[] args) {
        Area obj1 = new Circle();
        obj1.Area();
        obj1.notStatic();
    }
}
