import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter Three number between 1 and 6");

       int num1 = sc.nextInt();
       int num2 = sc.nextInt();
       int num3 = sc.nextInt();
       if(6<num1 || 6<num3 || 6<num2 || 1>num1 || 1>num3 || 1>num2){
        System.out.println("Numbers entered in not between 1 and 6. Shutting application down.");
        System.exit(0);
       }

       int roll1 = rollDice();
       int roll2 = rollDice();
       int roll3 = rollDice();

       int sumOfNums = num1+num2+num3;
       int sumOfRolls= roll1+roll2+roll3;

       System.out.println("Dice sum  = "+ sumOfRolls);
       System.out.println("Sum of num that you chose = "+ sumOfNums);
       System.out.println();
       if(comp(sumOfNums, sumOfRolls)){
        System.out.println("You Win!");
       }
       else{
        System.out.println("You lose!");
       }
       System.out.println();
       System.out.println();

       sc.close();
       
    }
    public static int rollDice(){
        return (int)(Math.random()*6)+1;
    }
    /**
     * @param snum
     * @param srolls
     * @return
     */
    public static boolean comp(int snum, int srolls){
        boolean b = (snum>srolls) && (snum-srolls<3);
        return b;
    }
}
