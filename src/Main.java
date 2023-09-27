import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static final DecimalFormat df = new DecimalFormat( "#.00" );
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("Tip Calculator!");
        System.out.println();

        System.out.print("Enter your total bill: ");
        double totalBill = scan.nextDouble();

        System.out.print("Enter tip percentage (as a whole number) you want to pay: ");
        double tipPercent = scan.nextDouble();
        tipPercent /= 100;

        System.out.print("Enter number of people in your party: ");
        int numberOfPeople = scan.nextInt();
        System.out.println();
        System.out.println();

        double totalTipAmount = totalBill * tipPercent;
        System.out.println("The total tip amount of your bill is $" + (df.format(totalTipAmount)));

        double finalTotalBill = totalBill + totalTipAmount;
        System.out.println("The total bill including tip is $" + (df.format(finalTotalBill)));

        double tipPerPerson = totalTipAmount / numberOfPeople;
        System.out.println("The total tip per person is $" + (df.format(tipPerPerson)));

        double totalPerPerson = finalTotalBill / numberOfPeople;
        System.out.println("The total bill including tip per person is $" + (df.format(totalPerPerson)));
    }
}