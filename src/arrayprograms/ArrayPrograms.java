/*Malika Sharma
 *16/10/2019
 *Array Program
 * 
 */

package arrayprograms;

import java.util.Scanner;

/**
 *
 * @author masha2470
 */
public class ArrayPrograms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner (System.in);
        int [ ] average = new int [5];
        int total = 0;
        while (true)
        { 
        System.out.println("Enter in your last five assignment marks and they will be calculated:");
        for (int i = 0; i <= 4; i = i + 1)
        {
           average[i] = keyedInput.nextInt();
        }
        for (int i = 0; i <= 4; i = i + 1)
        {
             total = total + average[i]/5;
        }
        System.out.println("The average of those numbers is:");
        System.out.println(total);
        }     
    } 
} 