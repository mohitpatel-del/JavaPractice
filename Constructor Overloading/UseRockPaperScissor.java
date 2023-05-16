package ExamplePack;

public class UseRockPaperScissor {
    public static void main(String[] args) {
        RockPaperScissor obj1 = new RockPaperScissor();
        RockPaperScissor obj2 = new RockPaperScissor(true);
        RockPaperScissor obj3 = new RockPaperScissor(true,false,true);
        RockPaperScissor obj4 = new RockPaperScissor(obj3);
    }
}
