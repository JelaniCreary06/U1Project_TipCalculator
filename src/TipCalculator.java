import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        double bill, tip;
        double totalBill, totalTip, tipPerPerson, totalPerPerson;

        int people;

        Scanner input = new Scanner(System.in);


        System.out.println("Are you now leaving?\nYou'll receive a few prompts for payment options.");
        System.out.print("Enter the total bill (total due): ");
        bill = input.nextDouble();

        System.out.print("Enter the tip percent (as a whole number): ");
        tip = (input.nextDouble() / 100);

        System.out.print("The total amount of people to split between: ");
        people = input.nextInt();

        totalTip = bill * tip;
        totalBill = bill + totalTip;
        tipPerPerson = totalTip / people;
        totalPerPerson = totalBill / people;

        totalTip = Math.round(totalTip * 100);
        totalBill = Math.round(totalBill * 100);
        tipPerPerson = Math.round(tipPerPerson * 100);
        totalPerPerson = Math.round(totalPerPerson * 100);

        totalTip /= 100; totalBill /= 100; tipPerPerson /= 100; totalPerPerson /= 100;


        System.out.println("\nCalculations complete.\nTotal Tip Amount: " + totalTip + "\nTotal Bill (includimg tip): " + totalBill + "\nTip Per Person: " + tipPerPerson + "\nTotal Per Person: " + totalPerPerson);
    }
}