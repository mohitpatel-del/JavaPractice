package ExamplePack;

public class UseEmp {
    public static void main(String[] args) {
        Emp a = new Emp("Ravi", 29);
        Emp b = new Emp("Kishan", 45);
        a.show();
        b.show();
        b.showNextId();
    }
}
