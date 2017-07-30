package br.com.diegogusava.algorithms.problems.string;

import java.util.ArrayList;
import java.util.List;

public class StringPrefix {

    public static List<String> get(String value) {

        List<String> prefixes = new ArrayList<>();

        for (int i = 1; i < value.length() + 1; i++) {

            prefixes.add(value.substring(0, i));

        }

        return prefixes;

    }

}
