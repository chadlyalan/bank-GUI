package homework210;

import java.text.NumberFormat;


public class example4_19 {

    public static void main(String[] args) {
        // loop for the rows
        for (int row = 0; row < 8; row++) {

            // center the output
            for (int spaces = 7 - row; spaces > 0; spaces--) {
                System.out.print("    ");
            }

            int limit = (int) Math.pow(2, row);

            // count forwards to the limit.
            for (int col = 1; col < limit; col *= 2) {
                System.out.printf("%4d", col);
            }
            // count backwards to 1.
            for (int col = limit; col >= 1; col /= 2) {
                System.out.printf("%4d", col);
            }
            System.out.println();
        }

    }

}
