import java.util.Scanner;
class WhileLoop
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = 2;
        int n = sc.nextInt();

        while(a<n){
            System.out.println(a);
            a+=2;
        }
        sc.close();
        
    }
}