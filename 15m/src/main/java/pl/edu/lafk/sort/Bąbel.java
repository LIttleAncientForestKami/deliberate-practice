package pl.edu.lafk.sort;

import java.util.Arrays;
import java.util.Random;

/**
 * Złożoność kwadratowa!
 *
 * @author Tomasz @LAFK_pl Borek
 */
class Bąbel {

    public static void main(String[] args) {
        final int[] ints = new Random().ints(30, 0, 100).toArray();
//        minBąbel(ints);
        sortuj(ints);

    }

    private static void sortuj(int[] ints) {
        System.out.println(Arrays.toString(ints));
        System.out.println();
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length-1; j++) {
                if(ints[j] > ints[j+1]) {
                    var tmp = ints[j+1];
                    ints[j+1] = ints[j];
                    ints[j] = tmp;
                }
            }
            System.out.println(Arrays.toString(ints));
        }
    }

    /**
     *  * Złożoność kwadratowa:
     *  * <li>dla każdego elementu tablicy</li>
     *  * <li>przechodzimy całą tablicę podmieniając elementy.</li>
     *  * W ten sposób po pierwszym przejściu min jest na dole.
     * @param ints tablica do posortowania.
     */
    private static void minBąbel(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            for (int j = i+1; j < ints.length; j++) {
                if(ints[j] < ints[i]) {
                    int tmp = ints[j];
                    ints[i] = ints[j];
                    ints[j] = tmp;
                }
                System.out.format("""
            Element nr: %d. Position we currently look at: %d.
            Array: %s
            """, i, j, Arrays.toString(ints));
            }
        }
    }
}
