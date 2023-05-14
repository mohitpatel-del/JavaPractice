public class Monthfalls {
    public static void main(String[] args) {
        String month = args[0];
        switch(month.toUpperCase())
        {
            case "NOV":
            case "DEC":
            case "JAN":
            case "FEB":
                System.out.println("Winter");
                break;
            case "MAR":
            case "APR":
            case "MAY":
            case "JUN":
                System.out.println("Summer");
                break;
            case "JUL":
            case "AUG":
            case "SEP":
            case "OCT":
                System.out.println("Rainy");
                break;
            default:
                System.out.println(month+" is invalid month name");
            
            
        }
    }
}
