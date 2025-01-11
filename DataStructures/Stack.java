public class Stack {
    static int top = 0;
    int Stack[] = new int[4];

    public void insert(int data){
        Stack[top] =data;
        top++;
    }

    public void show(){
        for(int n : Stack){
            System.out.print("Show = "+n+ " ");
        }
    }

    public void peek(){
        System.out.println("peek " + Stack[top-1]);
    }

    public void pop(){
        top--;
        System.out.println("pop "+ Stack[top]);
        Stack[top] = 0;
    }
}
