package br.com.diegogusava.algorithms.problems.string;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

import java.util.ArrayList;

import org.junit.Test;

public class StringProblemsTest {
    @Test
    public void findAllPermutations() throws Exception {
        StringProblems.permutation("abc");
    }


    @Test
    public void urlifyWithJavaApi() throws Exception {
    }

    @Test
    public void urlify() throws Exception {
        final String result = StringProblems.urlify("diego armando gusava");
        //d%20a%20g
        System.out.println(result);
    }

    @Test
    public void hasDuplicates() throws Exception {
        System.out.println(StringProblems.hasDuplicates("ab"));
    }

    @Test
    public void containsOnlyDigits() throws Exception {
        System.out.println(StringProblems.containsOnlyDigits("12345"));
    }

    @Test
    public void reverseIterative() throws Exception {
        System.out.println(StringProblems.reverseIterative("diego"));
    }

    @Test
    public void reverseRecursive() throws Exception {

        System.out.println(StringProblems.reverseRecursive("diego"));
    }

    @Test
    public void printFirstNonRepeatCharacter() throws Exception {

        final char result = StringProblems.printFirstNonRepeatCharacter("diieegdgo");
        System.out.println(result);

    }

    @Test
    public void checkAnagram() throws Exception {

        assertFalse(StringProblems.checkAnagram("pure", "in"));

        assertTrue(StringProblems.checkAnagram("word", "wrdo"));
        assertTrue(StringProblems.checkAnagram("mary", "army"));
        assertTrue(StringProblems.checkAnagram("stop", "tops"));
        assertTrue(StringProblems.checkAnagram("boat", "btoa"));
        assertFalse(StringProblems.checkAnagram("fill", "fil"));
        assertFalse(StringProblems.checkAnagram("b", "bbb"));
        assertFalse(StringProblems.checkAnagram("ccc", "ccccccc"));
        assertTrue(StringProblems.checkAnagram("a", "a"));
        assertFalse(StringProblems.checkAnagram("sleep", "slep"));



    }

    @Test
    public void printDuplicates() throws Exception {
        StringProblems.printDuplicates("diego armando gusava");
    }

    @Test
    public void printDuplicatesWithDataStructure() throws Exception {

        StringProblems.printDuplicatesWithDataStructure("diego armando gusava");

    }

}
