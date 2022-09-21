import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        double bill, tip;
        double totalBill, totalTip, tipPerPerson, totalPerPerson;

        int people;

        Scanner input = new Scanner(System.in);


        System.out.println("Are you now leaving?\nYou'll receive a few prompts for payment options.");
        System.out.print("Enter the total bill (payment): ");
        bill = input.nextDouble();

        System.out.print("Enter the tip amount (as a whole number): ");
        tip = (double) (input.nextInt() / 100);

        System.out.print("\nThe total amount of people to split between: ");
        people = input.nextInt();

        totalTip = bill * tip;
        totalBill = bill + totalTip;
        tipPerPerson = totalTip / people;
        totalPerPerson = totalBill / people;




    }
}