package br.com.diegogusava.algorithms.problems.binary;

public class CountNumberOne {

    /**
     * Count how many 1 exists in the number binary form
     * 
     * @param number
     * @return
     */
    public int count(int number) {

        int count = 0;

        while (number != 0) {
            number = number & (number - 1);
            count++;
        }

        return count;
    }

}
