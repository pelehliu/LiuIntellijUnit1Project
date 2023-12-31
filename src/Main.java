import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static final DecimalFormat df = new DecimalFormat( "#.00" ); // decimal formatting to round to the nearest hundreth
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in); // initializing scanner 
        System.out.println();
        System.out.println("Tip Calculator!");
        System.out.println();

        System.out.print("Enter your total bill: "); 
        double totalBill = scan.nextDouble();

        System.out.print("Enter tip percentage (as a whole number) you want to pay: ");
        double tipPercent = scan.nextDouble();
        tipPercent /= 100; // turns whole number into decimal so it is easier to compute later on

        System.out.print("Enter number of people in your party: ");
        int numberOfPeople = scan.nextInt();
        System.out.println();
        System.out.println();

        double totalTipAmount = totalBill * tipPercent; // calculates the total tip amount using stored data 
        System.out.println("The total tip amount of your bill is $" + (df.format(totalTipAmount)));

        double finalTotalBill = totalBill + totalTipAmount; // computes the total bill 
        System.out.println("The total bill including tip is $" + (df.format(finalTotalBill)));

        double tipPerPerson = totalTipAmount / numberOfPeople; // calculates how much tip an individual person will pay
        System.out.println("The total tip per person is $" + (df.format(tipPerPerson)));

        double totalPerPerson = finalTotalBill / numberOfPeople; // calculates how much each person will pay
        System.out.println("The total bill including tip per person is $" + (df.format(totalPerPerson)));
    }
}
