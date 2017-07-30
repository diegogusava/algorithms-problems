package br.com.diegogusava.algorithms.problems.string;

import java.util.ArrayList;
import java.util.List;

public class StringSuffix {

    public static List<String> get(String value) {

        List<String> suffixes = new ArrayList<>();
        for (int i = 0; i < value.length(); i++) {
            suffixes.add(value.substring(i, value.length()));
        }

        return suffixes;

    }

}
