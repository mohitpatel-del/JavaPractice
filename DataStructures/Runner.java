public class Runner {
    public static void main(String[] args) {
        BinaryTree t = new BinaryTree();

        t.insert(15);
        t.insert(25);
        t.insert(5);
        t.insert(3);
        t.insert(27);
        t.insert(19);

        System.out.println("Inorder : ");
        t.inorder();

        System.out.println();
        System.out.println("Preorder : ");
        t.preorder();
    }
}
