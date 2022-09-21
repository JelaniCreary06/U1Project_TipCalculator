import java.util.Scanner;
import java.text.DecimalFormat;

public class TipCalculator {
    public static void main(String[] args) {
        double bill, tip;
        double totalBill, totalTip, tipPerPerson, totalPerPerson;

        int people;

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        //Lines 15 - 23 get the inputted values.
        System.out.println("Are you now leaving?\nYou'll receive a few prompts for payment options.");
        System.out.print("Enter the total bill (total due): ");
        bill = input.nextDouble();

        System.out.print("Enter the tip percent (as a whole number): ");
        tip = (input.nextDouble() / 100);

        System.out.print("The total amount of people to split between: ");
        people = input.nextInt();

        //Lines 25 - 29 calculate the appropriate values.
        totalTip = bill * tip;
        totalBill = bill + totalTip;
        tipPerPerson = totalTip / people;
        totalPerPerson = totalBill / people;

        // Lines 28 - 34 round the numbers to the nearest decimal places. there'll always be 2 decimal places.
        totalTip = Math.round(totalTip * 100);
        totalBill = Math.round(totalBill * 100);
        tipPerPerson = Math.round(tipPerPerson * 100);
        totalPerPerson = Math.round(totalPerPerson * 100);

        df.format(totalTip /= 100); df.format(totalBill /= 100); df.format(tipPerPerson /= 100); df.format(totalPerPerson /= 100);

        //The following print statement prints out the completed calculations.
        System.out.println("\nCalculations complete.\nTotal Tip Amount: " + totalTip + "\nTotal Bill (includimg tip): " + totalBill + "\nTip Per Person: " + tipPerPerson + "\nTotal Per Person: " + totalPerPerson);
    }
}