package br.com.diegogusava.algorithms.problems.math;

public class Prime {

    /**
     * A number is prime if it is only divisible by 1 and itself. So for example 2, 3, 5, 79, 311 and 1931 are all prime,
     * while 21 is not prime because it is divisible by 3 and 7. To find if a number n is prime we could simply check if
     * it divides any numbers below it. We can use the modulus (%) operator to check for divisibility:
     * 
     * @param num
     * @return
     */
    public static boolean isPrime(int num) {

        if (num <= 1) {
            return false;
        }

        if (num == 2) {
            return true;
        }

        for (int i = 3; i < num; i++) {

            if (num % i == 0) {
                return false;
            }

        }

        return true;

    }

    /**
     * A number is formed by prime numbers9
     *
     * We can make this code run faster by noticing that we only need to check divisibility for values of i that are less or equal to the
     * square root of n (call this m). If n divides a number that is greater than m then the result of that division will be some number less
     * than m and thus n will also divide a number less or equal to m. Another optimization is to realize that there are no even primes greater
     * than 2. Once we’ve checked that n is not even we can safely increment the value of i by 2.
     * 
     * @param num
     * @return
     */
    public static boolean isPrimeFaster(int num) {

        if (num <= 1) {
            return false;
        }

        if (num == 2) {
            return true;
        }

        final double m = Math.sqrt(num);

        for (int i = 3; i < m; i += 2) {

            if (num % i == 0) {
                return false;
            }

        }

        return true;

    }

}
