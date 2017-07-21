package br.com.diegogusava.algorithms.problems.string;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/**
 * http://javarevisited.blogspot.com.br/2015/01/top-20-string-coding-interview-question-programming-interview.html#axzz4n5s2I1Yu
 */
public class StringProblems {

    /**
     * How to Print duplicate characters from String?
     *
     * You need to write a program to print duplicate characters from a given String, for example if String is "Java"
     * then program should print "a". Bonus points if your program is robust and handle different kinds of input e.g.
     * String without duplicate, null or empty String etc. Bonus points if you also write unit tests for normal and edge cases.
     * 
     * @param text
     */
    public static void printDuplicatesWithDataStructure(String text) {

        if (text == null || text.isEmpty()) {
            System.out.println("Empty String");
            return;
        }

        final char[] value = text.toCharArray();
        Set<Character> set = new HashSet<>();

        for (char c : value) {
            if (c == ' ') {
                continue;
            }
            if (set.contains(c)) {
                System.out.println(c);
            } else {
                set.add(c);
            }
        }

    }

    public static void printDuplicates(String text) {

        if (text == null || text.isEmpty()) {
            System.out.println("Empty String");
            return;
        }

        final char[] value = text.toCharArray();

        for (int i = 0; i < value.length; i++) {

            if (value[i] == ' ') {
                continue;
            }

            for (int j = i + 1; j < value.length; j++) {
                if (value[i] == value[j]) {
                    System.out.println(value[i]);
                    value[j] = ' ';
                }
            }
        }

    }

    /**
     * How to check if two Strings are anagrams of each other?
     *
     * A simple coding problem based upon String, but could also be asked with numbers. You need to write a Java program
     * to check if two given strings are anagrams of Each other. Two strings are anagrams if they are written using the
     * same exact letters, ignoring space, punctuation and capitalization. Each letter should have the same count in both
     * strings. For example, Army and Mary are anagram of each other.
     *
     * @param text1
     * @param text2
     */
    public static boolean checkAnagram(String text1, String text2) {

        if (text1.length() != text2.length()) {
            return false;
        }

        final int len = Math.max(text1.length(), text2.length());

        int[] count = new int[26];

        for (int i = 0; i < len; i++) {

            if (i < text1.length()) {
                final char c = Character.toLowerCase(text1.charAt(i));
                if (c == ' ') {
                    continue;
                }
                int index = c - 'a';
                count[index]++;
            }

            if (i < text2.length()) {
                final char c = Character.toLowerCase(text2.charAt(i));
                if (c == ' ') {
                    continue;
                }
                int index = c - 'a';
                count[index]--;
            }
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * How to program to print first non repeated character from String?
     *
     * One of the most common string interview questions: Find the first non-repeated (unique) character in a given string.
     * for Example if given String is "Morning" then it should print "M". This question demonstrates efficient use of Hashtable.
     * We scan the string from left to right counting the number occurrences of each character in a Hashtable. Then we perform
     * a second pass and check the counts of every character. Whenever we hit a count of 1 we return that character, that’s
     * the first unique letter. Be prepared for follow-up question for improving memory efficiency, solving it without hash table as well.
     *
     * @param text
     */
    public static char printFirstNonRepeatCharacter(String text) {

        final char[] value = text.toCharArray();

        int[] count = new int[26];

        for (int i = 0; i < value.length; i++) {
            final char v = value[i];
            count[v - 'a']++;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] == 1) {
                char a = (char) (i + 'a');
                return a;
            }
        }
        return ' ';
    }

    /**
     * How to reverse String in Java using Iteration and Recursion?
     */
    public static String reverseRecursive(String text) {
        return reverseRecursive(text.toCharArray(), 0);
    }

    private static String reverseRecursive(char[] values, int low) {
        if (low >= values.length / 2) {
            return new String(values);
        }

        char temp = values[low];

        values[low] = values[values.length - low - 1];
        values[values.length - low - 1] = temp;

        return reverseRecursive(values, low + 1);
    }

    public static String reverseIterative(String text) {

        final char[] values = text.toCharArray();
        for (int i = 0; i < text.length() / 2; i++) {
            final char temp = values[i];
            values[i] = values[text.length() - i - 1];
            values[text.length() - i - 1] = temp;
        }

        return new String(values);
    }

    /**
     * You need to write a program to check a String contains only numbers by using Regular expression in Java.
     * You can use Java API but a solution without using Java API will be better because that is what interviewer can always ask.
     * 
     * @param text
     * @return
     */
    public static boolean containsOnlyDigits(String text) {
        return Pattern.matches("\\d+", text);
    }

    /**
     * How to find duplicate characters in a String
     * 
     * @param text
     * @return
     */
    public static boolean hasDuplicates(String text) {

        final int[] count = new int[26];
        final char[] values = text.toCharArray();

        for (int i = 0; i < values.length; i++) {
            count[values[i] - 'a']++;
            if (count[values[i] - 'a'] > 1) {
                return true;
            }
        }
        return false;
    }

    /**
     * How to count number of vowels and consonants in a String
     *
     * One of easiest String question you will ever see. You have to write a Java program which will take a String
     * input and print out number of vowels and consonants on that String. For example the if input is "Java" then your
     * program should print "2 vowels and 2 consonants". If you get this question on Interview, you should clarify
     * that whether String can contain numbers, special characters or not e.g. anything other than vowels and consonants.
     * 
     * @param text
     */
    public static void countVowelsAndConsonants(String text) {
        final char[] values = text.toCharArray();

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < values.length; i++) {
            char value = values[i];
            value = Character.toLowerCase(value);
            if (value == 'a' || value == 'e' || value == 'e' || value == 'o' || value == 'u') {
                vowels++;
            } else {
                consonants++;
            }
        }

        System.out.println("Vowels: " + vowels + " Consonants: " + consonants);
    }

    /**
     * How to count occurrence of a given character in String
     *
     *
     */
    public static int countOccorrence(String text, char v) {
        final char[] values = text.toCharArray();

        int count = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == v) {
                count++;
            }
        }

        return count;
    }

    public static String urlifyWithJavaApi(String text) {
        return text.replaceAll(" ", "%20");
    }

    public static String urlify(String text) {
        final char[] values = text.toCharArray();

        int count = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == ' ') {
                count++;
            }
        }

        final char[] result = new char[((count * 3) - count) + text.length()];

        for (int i = 0, k = 0; i < values.length; i++, k++) {
            final char v = values[i];
            if (v == ' ') {
                result[k++] = '%';
                result[k++] = '2';
                result[k] = '0';
            } else {
                result[k] = values[i];
            }
        }

        return new String(result);
    }

    /*
    * A method exposed to client to calculate permutation of String in Java.
    */
    public static void permutation(String input) {
        permutation("", input);
    }

    /*
     * Recursive method which actually prints all permutations
     * of given String, but since we are passing an empty String
     * as current permutation to start with,
     * I have made this method private and didn't exposed it to client.
     */
    private static void permutation(String perm, String word) {
        if (word.isEmpty()) {
            System.err.println(perm + word);

        } else {
            for (int i = 0; i < word.length(); i++) {
                permutation(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length()));
            }
        }

    }

}
