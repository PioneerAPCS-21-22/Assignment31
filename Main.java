/**
 * A31
 *
 * @author
 * @version
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many values? ");
        int n = in.nextInt();
        double[] arr = new double[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Enter next value: ");
            arr[i] = in.nextDouble();
        }   
        printArr(arr);
        System.out.println("Median = " + median(arr));
    }

    /**
     * Computes the median for the set, which is the middle value. If there 
     * are two middle values, then the median is the average of those two values.
     * @param vals - the set of numbers as an array of doubles.
     * @return the median of the set of numbers.
     */
    public static double median(double[] vals) {
    
        

    }

    /**
     * Puts the set in order from smallest to largest (using the selection sort algorithm).
     * @param vals - the set of numbers to be sorted as an array of doubles.
     * @return the sorted array.
     */
    public static double[] ordered(double[] vals) {
        // Find the smallest value and move it to the front (swap values).
        // Find the smallest values (starting at index 1) and swap it with the value at index 1.
        // Repeat for the rest of the array.
        // Print the sorted array and then return the sorted array.

        
    }

    /**
     * Finds the index of the smallest value in the set.
     * @param vals  - the set of numbers as an array of doubles.
     * @param index - the index from which to start the search.
     * @return the index where the smallest value is, starting at the specified index.
     */
    public static int indexOfSmallest(double[] vals, int index) {



    }

    /**
     * Prints the contents of the given array.
     * @param arr - the array of doubles to be printed.
     */
    public static void printArr(double[] arr) {
        System.out.print("{");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
