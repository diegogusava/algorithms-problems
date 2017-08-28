package br.com.diegogusava.algorithms.problems.string;

public class LongestCommonPrefix {

    public static String get(String text1, String text2) {

        int commonLen = Math.min(text1.length(), text2.length());

        for (int i = 0; i < commonLen; i++) {

            if (text1.charAt(i) != text2.charAt(i)) {
                return text1.substring(0, i);
            }

        }
        return text1.substring(0, commonLen);
    }

}
