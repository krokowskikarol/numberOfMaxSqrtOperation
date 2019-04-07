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
public class maxSqrtWithinAgivenRange {

    public int numberOfSquares(int num) {
        int sum = 0;
        if (num > 1) {
            double sqrtBase = num;
            while (Math.sqrt(sqrtBase) % 1 == 0) {
                sum++;
                sqrtBase = Math.sqrt(sqrtBase);
            }
        }
        return sum;
    }

    public int maxNumberOfSqrt(int start, int end) {
        int max = 0;
        int sqrt = 0;
        for (int i = start; i <= end; i++) {
            sqrt = numberOfSquares(i);
            if (sqrt > max) {
                max = sqrt;
            }
        }
        return max;
    }
}
