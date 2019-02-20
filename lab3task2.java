import java.util.Scanner;

class lab3task2
{
    public static void main (String[] args)
    {
        Scanner keyboard;
        double x;
        int n;

        keyboard = new Scanner(System.in);
        System.out.print("Enter a number: ");
        x = keyboard.nextDouble();
        
        // step one: print the $
        System.out.print("$");

        // step two: get the integer part
        n = (int) x;
        System.out.print(n);

        // step three: print.
        System.out.print(".");

        // step four: first decimal digit
        x = x - n; // get the decimal part only
        x = x * 10; // move the decimal point to the right
        n = (int) x; // extract that digit
        System.out.print(n);

        // step five: get second digit
        x = x - n; // get the decimal part only
        x = x * 10; // move the decimal
        n = (int) x; // extract that digit
        System.out.print(n);
    }
}