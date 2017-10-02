/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

import java.util.Scanner;

/**
 *
 * @author naree1878
 */
public class Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        squareOfAsterisks(sc.nextInt());
    }
    /**
     * inputs a side length from the user and outputs a square of that length and width
     * @param side 
     */

    public static void squareOfAsterisks(int side) {
        for (int x = 0; x < side; x++) {
            for (int y = 0; y < side; y++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
