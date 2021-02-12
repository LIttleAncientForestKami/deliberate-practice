package pl.edu.lafk.sort;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author Tomasz @LAFK_pl Borek
 */
class Test {

    public static void main(String[] args) {
//        int[] t = new int[] {5,3,7, 2,1, 12};
        int[] t = new int[] {1,2, 3, 5,13,17, 20,21, 212};
        for (int i = 0; i < t.length; i++) {
            int obecny = t[i];
            int j = i-1;
            while (j>=0 && t[j]>obecny) {
                t[j+1] = t[j];
                j--;
            }
            t[j+1]=obecny;
        }
        System.out.println(Arrays.toString(t));

        LinkedList ll;
    }
}
