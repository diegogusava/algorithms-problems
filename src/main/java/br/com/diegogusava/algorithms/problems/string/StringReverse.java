package br.com.diegogusava.algorithms.problems.string;

public class StringReverse {

    public static String reverseWithStringBuilder(String value) {
        return new StringBuilder(value).reverse().toString();
    }

    public static String reverseInline(String value) {
        final char[] chars = value.toCharArray();

        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - i - 1];
            chars[chars.length - i - 1] = temp;
        }

        return new String(chars);
    }

}
