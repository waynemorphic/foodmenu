public class foodImproved {
    public static void main (String[] args){ //start of main subroutine
        int food;
        System.out.print("I will help you decide what to prepare today.");
        System.out.print(" You only need to enter a number between the range 1 to 5.");
        System.out.print("For instance 1 or 3 or 5");
        System.out.println();
        System.out.println("Please enter a number");
        food = TextIO.getInt();
        System.out.println("Today you will have " + foodMenu(food));
        }
    static String foodMenu(int food){ //foodMenu subroutine for food function
        if (food < 1) //if the input is less than 1, throw an illegal exception
            throw new IllegalArgumentException("Number should be greater than 1");
        else if (food == 1)
            return "rice & beans";
        else if (food == 2)
            return "rice & ndengu";
        else if (food == 3)
            return "rice & njahi";
        else if (food == 4)
            return "ugali & eggs";
        else if (food == 5)
            return "ugali & mala";
        else if (food >= 6) // if the input is greater than 5, throw an illegal exception
            throw new IllegalArgumentException("Number should be less than 5");
        return null;
    } //end of foodMenu subroutine
}
