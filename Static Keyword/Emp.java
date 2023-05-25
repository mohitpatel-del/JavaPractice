package ExamplePack;

public class Emp {
    private int age;
    private String name;
    public static int NextId = 1;
    private int id;

    public Emp(String n, int a){
        name= n;
        age = a;
        id = NextId;
        NextId++;
    }
    public void show(){
        System.out.println("Name = "+ name);
        System.out.println("age = "+ age);
        System.out.println("ID = "+ id);

    }
    public void showNextId(){
        System.out.println("Next ID = "+ NextId);
    }
}
