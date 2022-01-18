package homework210;

import javax.swing.JOptionPane;


public class example4_8 {

    public static void main(String[] args) {
        String text = JOptionPane.showInputDialog("How many scores?");
        int numberOfScores = Integer.parseInt(text);
        int highest = -1;

        for (int i = 1; i <= numberOfScores; i++) {
            text = JOptionPane.showInputDialog("Enter score #" + i);
            int score = Integer.parseInt(text);

            if (score > highest) {
                highest = score;
            }
        }
        System.out.println(highest);
    }

}
