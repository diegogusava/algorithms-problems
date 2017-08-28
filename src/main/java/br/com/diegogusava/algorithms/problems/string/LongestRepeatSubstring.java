package br.com.diegogusava.algorithms.problems.string;

import java.util.Collections;
import java.util.List;

public class LongestRepeatSubstring {

    public static String get(String text) {

        final List<String> sufixes = StringSuffix.get(text);
        Collections.sort(sufixes);

        String longestSubstring = "";

        for (int i = 0; i < text.length() - 1; i++) {
            final String result = LongestCommonPrefix.get(sufixes.get(i), sufixes.get(i + 1));

            if (result.length() > longestSubstring.length()) {
                longestSubstring = result;
            }
        }

        return longestSubstring;
    }

}
