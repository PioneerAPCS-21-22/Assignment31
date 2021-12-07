/**
 * A31
 *
 * @author Mr. King
 * @version 12/6/2021
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many values? ");
        int n = in.nextInt();
        while(n < 1) {
            System.out.print("Please enter a positive value: ");
            n = in.nextInt();
        }
        double[] arr = new double[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Enter next value: ");
            arr[i] = in.nextDouble();
        }   
        printArr(arr);
        System.out.println("Median = " + median(arr));
    }

    /**
     * Computes the median for the set.
     * @param vals - the set of numbers as an array of doubles.
     * @return the median of the set of numbers.
     */
    public static double median(double[] vals) {
        double[] ord = ordered(vals);
        if(ord.length % 2 == 1) {
            return ord[ord.length / 2];
        }
        return (ord[ord.length / 2 - 1] + ord[ord.length / 2]) / 2;
    }

    /**
     * Puts the set in order from smallest to largest (using the selection sort algorithm).
     * @param vals - the set of numbers to be sorted as an array of doubles.
     * @return the sorted array.
     */
    public static double[] ordered(double[] vals) {
        for(int i = 0; i < vals.length - 1; i++) {
            int s = indexOfSmallest(vals, i);
            double v = vals[i];
            vals[i] = vals[s];
            vals[s] = v;
        }
        printArr(vals);
        return vals;
    }

    /**
     * Finds the index of the smallest value in the set.
     * @param vals  - the set of numbers as an array of doubles.
     * @param index - the index from which to start the search.
     * @return the index where the smallest value is, starting at the specified index.
     */
    public static int indexOfSmallest(double[] vals, int index) {
        int s = index;

        for(int i = index + 1; i < vals.length; i++) {
            if(vals[i] < vals[s]) {
                s = i;
            }
        }

        return s;
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
