package br.com.diegogusava.algorithms.problems.selection;

import static org.junit.Assert.*;

import org.junit.Test;

public class QuickSelectTest {


    @Test
    public void greaterNumber() throws Exception {
        final int greaterNumber = QuickSelect.select(new int[] { 1, 5, 4, 6, 3 }, 1);
        assertEquals(6, greaterNumber);

    }


    @Test
    public void secondGreaterNumber() {
        final int greaterNumber = QuickSelect.select(new int[] { 1, 5, 4, 6, 3 }, 2);
        assertEquals(5, greaterNumber);
    }

}
