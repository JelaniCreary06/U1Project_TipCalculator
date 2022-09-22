import java.util.Scanner;
import java.text.DecimalFormat;

public class TipCalculator {
    public static void main(String[] args) {
        double bill, tip;
        double totalBill, totalTip, tipPerPerson, totalPerPerson;

        int people;

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        //Lines 15 - 23 get the inputted values through the Scanner method, and assign them to variables.
        System.out.println("Are you now leaving?\nYou'll receive a few prompts for payment options.");
        System.out.print("Enter the total bill (total due): ");
        bill = input.nextDouble();

        System.out.print("Enter the tip percent (as a whole number): ");
        tip = (input.nextDouble() / 100);

        System.out.print("The total amount of people to split between: ");
        people = input.nextInt();

        //Lines 25 - 29 calculate the appropriate values, and reassign them to defined variables.
        totalTip = bill * tip;
        totalBill = bill + totalTip;
        tipPerPerson = totalTip / people;
        totalPerPerson = totalBill / people;

        /*The following print statement prints out the completed calculations,
        while using decimal format to round to the first 2 decimal places.
        */
        System.out.println("\nCalculations complete.\nTotal Tip Amount: " + df.format(totalTip) + "\nTotal Bill (including tip): " + df.format(totalBill) + "\nTip Per Person: " + df.format(tipPerPerson) + "\nTotal Per Person: " + df.format(totalPerPerson));
    }
}