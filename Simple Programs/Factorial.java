import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f=1;
        
       
            while(n>0)
            {
                f = n*f;
                
                System.out.println("n is = "+n);
                n -=1;
            }

            System.out.println("Factorial is "+ f);

        sc.close();
    }
}
