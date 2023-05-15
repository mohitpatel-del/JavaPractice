package ExamplePack;

import java.util.Scanner;

public class UseResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Percentage without % sign");
        int p = sc.nextInt();
        System.out.println("Enter Pass or Fail Status(If passed True / failed False");
        String status;
        sc.nextLine();
        status = sc.nextLine();

        if(status.equalsIgnoreCase("True")){
            Result obj1 = new Result(status);
            System.out.println(obj1.showRes());
        }
        else{
            Result obj1 = new Result(p);
            System.out.println(obj1.showPer());
        }

    }
}
