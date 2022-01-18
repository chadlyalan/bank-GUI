package homework210;

public class example5_11 {
    public static void main(String[] args) {
        System.out.println("Sales Amount\tCommission");
        // write a loop for the sales amount.
        for (int sales = 10000; sales <= 100000; sales += 5000) {
            double commission = computeCommission(sales);
            System.out.println(sales + "\t\t" + commission);
        }
    }

    public static double computeCommission(double salesAmount) {
        // make sure its above 0
        if (salesAmount < 0) {
            return -1;
        }

        double commission;
        if (salesAmount <= 5000) {
            commission = salesAmount * .08;
        } else if (salesAmount <= 10000) {
            commission = 5000 * .08 + (salesAmount - 5000) * 0.10;
        } else {
            commission = 5000 * .08 +
                    5000 * 0.10 +
                    (salesAmount - 10000) * .12;
        }
        return commission;
    }
}
