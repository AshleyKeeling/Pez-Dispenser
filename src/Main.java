import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("\nWelcome to PEZ Dispenser");
        System.out.println("\nwhat head would you like on your PEZ Dispenser? ");

        String PEZHead = userInput.next();

        // creates PEZ Dispenser object with the PEZHead
        PezDispenser pd = new PezDispenser(PEZHead);



        pd.fill();


        pd.dispense();

    }
}
