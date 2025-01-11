public class DynamicStack {
    static int top = 0;
    int capacity = 2;
    int Stack[] = new int[capacity];


    public int size(){
        return top;
    }

    public void insert(int data){
        if(capacity ==size() )
            expand();
        Stack[top] =data;
        top++;
    }

    private void expand(){
        int length = size();
        int newStack[] = new int[capacity*2];
        System.arraycopy(Stack, 0, newStack, 0, length);
        capacity = capacity*2;
        Stack = newStack;
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
