import java.util.Sanner;

public class SalesTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter purchase amount; ");
        double purchaseAmount = input.nextDouble();

        double tax = purhcaseAmount * .06;
        System.out.println("Sales tax is $" + (int)(tax * 100)/100.0);
    }
}