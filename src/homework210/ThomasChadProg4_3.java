package homework210;

import java.text.NumberFormat;


public class ThomasChadProg4_3 {
    public static void main(String[] args) {
        System.out.println("Kilograms\tPounds");

        int kilos = 1;
        float pounds = (int) kilos * 2.2f;

        NumberFormat formatter = NumberFormat.getInstance();
        formatter.setMinimumFractionDigits(1);
        formatter.setMaximumFractionDigits(1);

        for (int i = 1; i <= 199; i += 2) {
            System.out.println(kilos * i + "\t\t  " + formatter.format(pounds * i));
        }

    }

}
