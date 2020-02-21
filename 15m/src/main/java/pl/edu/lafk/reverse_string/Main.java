package pl.edu.lafk.reverse_string;

import java.util.Objects;
import java.util.stream.Stream;

/**
 * Reverse words in a string 1st try.
 * Task was ambiguous so in the end I have three reversals:
 * <ol>
 *     <li>whole string from the beginning, no matter how many words</li>
 *     <li>reverse word order and also words themselves</li>
 *     <li>reverse every word without reversing word order</li>
 * </ol>
 *
 * @see a JShell snippet, <code>odwracamy.jsh</code> for recursive approach reversing just word order
 * @author Tomasz @LAFK_pl Borek
 */
class Main {

    /*
    TODO: na przyszłość,
     1. wyprowadzić metody z implementacją do osobnych klas by łatwiej je było oglądać
     2. odpalać programistycznie JSHELLa via jdk.jshell API
     https://docs.oracle.com/javase/10/docs/api/jdk.jshell-summary.html
     3. tu mają zostać tylko dane testowe i odpalanie wszystkiego innego
     */

    public static void main(String[] args) {
        Stream.of("the sky is blue",
                "a quick brown fox jumped over the lazy dog",
                "abra kadabra hokus pokus").forEach( s -> {

            Objects.requireNonNull(s);
            if (s.isBlank()) throw new IllegalArgumentException("blank inputs disallowed");

            System.out.println(reverse(s));
            System.out.println(reverseAllInPlace(s.toCharArray()));
            System.out.println(reverseInPlace(s.toCharArray()));
        });
    }

    private static char[] reverseInPlace(char[] s) {
        int idx = 0, start = 0;
        if (s == null || s.length <= 1) return s;
        while (s.length > idx) {
            if(s[idx] == ' ') { // FIXME: co z innymi białymi znakami?
                reverseWord(s, start, idx-1);
                start = idx+1;
            }
            idx++;
        }
        reverseWord(s, start, idx-1);
        return s;
    }

    private static void reverseWord(char[] src, int start, int finish) {
        while(start < finish) {
            char tmp = src[finish];
            src[finish] = src[start];
            src[start] = tmp;
            start++;
            finish--;
        }
    }

    private static char[] reverseAllInPlace(char[] s) {
        for(int i = 0; i<s.length/2; i++) {
            char tmp = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] = tmp;
        }
        return s;
    }

    private static String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        for(String word : s.split(" ")) {
            sb.insert(0, " ").insert(0, word);
        }
        return sb.toString();
    }
}