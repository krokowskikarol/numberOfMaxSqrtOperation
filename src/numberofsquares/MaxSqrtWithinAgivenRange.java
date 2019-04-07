/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberofsquares;

/**
 *
 * @author kroko
 */
public class MaxSqrtWithinAgivenRange {

    public int numberOfSquares(int num) {
        int sum = 0;
        if (num > 1) {                              // barrier loop (if you give as num argument 1 it get sqrt(1) = 1.0 and we gonna walk into infinite loop problem)
            double sqrtBase = num;
            while (Math.sqrt(sqrtBase) % 1 == 0) {  // as long as u get int from sqrt operation 
                sum++;                              // increase counter
                sqrtBase = Math.sqrt(sqrtBase);     // and update the number we take sqrt from
            }
        }
        return sum;                                 // return sum of correctly executed sqrt operations
    }

    public int maxNumberOfSqrtInRange(int start, int end) {
        int max = 0;                                // counter of max sqrt operations
        int sqrt = 0;                               // variable for updated sqrt
        for (int i = start; i <= end; i++) {        // loop with a given range
            sqrt = numberOfSquares(i);              // we calculate max number of sqrt operations for that number (i)
            if (sqrt > max) {                       // check if current muber of operation is greater than max
                max = sqrt;                         // if so update max
            }
        }
        return max;                                 // return max
    }
}
