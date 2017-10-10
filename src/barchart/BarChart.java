// Fig. 7.6: BarChart.java
// Bar chart printing program.
package barchart;

import java.util.Random;

public class BarChart {

    public static void main(String[] args) {
        Random r = new Random();
        int[] dice = new int[11];
        for (int i = 0; i < 36000000; i++) {
            dice[r.nextInt(6) + r.nextInt(6)]++;
        }
        for (int i = 2; i < 12; i++) {
            System.out.println(i + ": " + dice[i - 2]);
        }
    }
}
