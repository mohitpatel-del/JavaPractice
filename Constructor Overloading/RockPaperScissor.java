package ExamplePack;

public class RockPaperScissor {
    private boolean rock;
    private boolean paper;
    private boolean scissor;
    public RockPaperScissor(){
        System.out.println("CONSTRUCTOR 1");
        this.show();
        System.out.println();
    }
    public RockPaperScissor(boolean value){
        System.out.println("CONSTRUCTOR 2");
        rock = value;
        paper= value;
        scissor= value;
        this.show();
        System.out.println();

    }
    public RockPaperScissor(boolean value1,boolean value2,boolean value3){
        System.out.println("CONSTRUCTOR 3");
        rock = value1;
        paper= value2;
        scissor= value3;
        this.show();
        System.out.println();

    }
    public RockPaperScissor (RockPaperScissor obj){
        System.out.println("CONSTRUCTOR 4");
        obj.show();
        System.out.println();
    }
    public void show(){
        System.out.println(rock);
        System.out.println(paper);
        System.out.println(scissor);
    }

}
