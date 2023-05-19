public class DocComments {
    public static void main(String args[]){

    }
    /**
     * Function name : greet
     * 
     * 
     * Inside the function: 
     *  1.Prints = 'Hi'
     * 
     */


    public static void greet(){
        System.out.println("Hi");
    }

    /**
     * Function name:printText
     * @param name (String)
     * @param age (String)
     * 
     * Inside the Function:
     * 1. prints name and age as part of the text.
     */

    public static void printText(String name, String age){
        System.out.println("Hi my name is "+name+" and I am "+age+" years old.");
    }

    /**
     * Function name : areaOfSquare
     * @param side (double)
     * @return     (double)
     * 
     * Inside the function:
     * 1. Returns the area of square by doing = 4*side.
     */

    public static double areaOfSquare(double side){
        return 4*side;
    }
}
