package homework210;


public class ThomasChadProg4_10 {

    public static void main(String[] args) {
        // loop counting from 100 to 1000
        int count = 0;
        for (int i = 100; i <= 1000; i++) {
            // output the numbers that are divisible by 5 and 6.
            if (i % 5 == 0 && i % 6 == 0) {
                System.out.print(i + " ");
                // every 10 times output a new line.
                if (++count == 10) {        // preincrement, if its 10
                    System.out.println();    // reset count to zero after
                    count = 0;                // outputing the newline.
                }
            }
        }
    }
}
