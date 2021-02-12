/**
 * A,E-I.
 */
package pl.edu.lafk.sort;

import java.util.Arrays;
import java.util.Random;

/**
 * Pętle for są przecież proste i każdy je zna!
 *
 * @author Tomasz @LAFK_pl Borek
 */
class PętlaFor {
    private int[] ints = losowo();

    private int[] losowo() {
        return new Random().ints(30, 0, 100).toArray();
    }

    public static void main(String[] args) {
        final PętlaFor pf = new PętlaFor();
        pf.forA();
        pf.ints = pf.losowo();
        pf.forB();
        pf.ints = pf.losowo();
        pf.forC();
        pf.ints = pf.losowo();
        pf.forD();
        pf.ints = pf.losowo();
        pf.forE();
        pf.ints = pf.losowo();
//        pf.forF();
    }

    private void forA() {
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length-1; j++) {
                if(ints[j] > ints[j+1]) {
                    var tmp = ints[j+1];
                    ints[j+1] = ints[j];
                    ints[j] = tmp;
                }
            }
            drukuj();
        }
    }

    private void forB() {
        for (int i = 0; i < ints.length; i++) {
            for (int j = i+1; j < ints.length; j++) {
                if(ints[j] < ints[i]) {
                    int tmp = ints[j];
                    ints[i] = ints[j];
                    ints[j] = tmp;
                }
            }
            drukuj();
        }
    }

    private void forC() {
        for (int i = 0; i < ints.length; i++) {
            for (int j = i+1; j < ints.length-1; j++) {
                if(ints[j] < ints[i]) {
                    int tmp = ints[j];
                    ints[i] = ints[j];
                    ints[j] = tmp;
                }
            }
            drukuj();
        }
    }

    private void forD() {
        for (int i = 0; i < ints.length; i++) {
            for (int j = i+1; j < ints.length-1; j++) {
                if(ints[j] < ints[i]) {
                    int tmp = ints[j];
                    ints[j] = ints[i];
                    ints[i] = tmp;
                }
            }
            drukuj();
        }
    }

    private void forE() {
        for (int i = 0; i < ints.length; i++) {
            for (int j = i+1; j < ints.length; j++) {
                if(ints[i] > ints[j]) {
                    var tmp = ints[i];
                    ints[i] = ints[j];
                    ints[j] = tmp;
                }
            }
            drukuj();
        }
    }

    private void forF() {
        var idxMax = 0;
        for (int i = 0; i < ints.length; i+=1) {
            for (int j = 0; j < ints.length; j+=1) {
                if(ints[i] > ints[j]) {
                    var tmp = ints[i];
                    ints[i] = ints[j];
                    ints[j] = tmp;
                }
            }
            drukuj();
        }
    }

    private void forG() {
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length; j++) {
                if(ints[i] > ints[j]) {
                    var tmp = ints[i];
                    ints[i] = ints[j];
                    ints[j] = tmp;
                }
            }
            drukuj();
        }
    }

    private void forH() {
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length; j++) {
                if(ints[i] > ints[j]) {
                    var tmp = ints[i];
                    ints[i] = ints[j];
                    ints[j] = tmp;
                }
            }
            drukuj();
        }
    }
    private void forI() {
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length; j++) {
                if(ints[i] > ints[j]) {
                    var tmp = ints[i];
                    ints[i] = ints[j];
                    ints[j] = tmp;
                }
            }
            drukuj();
        }
    }

    void drukuj() {
        System.out.println(Arrays.toString(ints));
    }
}
