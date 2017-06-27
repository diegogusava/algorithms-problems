package br.com.diegogusava.algorithms.problems.recursion;

public class TowerHanoi {

    /**
     * 3 plates
     *
     * @param plates
     * @param source
     * @param aux
     * @param target
     */
    public void execute(int plates, String source, String aux, String target) {

        if (plates == 1) {
            System.out.println("Plate 1:  " + source + " -> " + target);
            return;
        }

        execute(plates - 1, source, target, aux);

        System.out.println("Plate " + plates + ": " + source + " -> " + target);

        execute(plates - 1, aux, source, target);

    }


}
