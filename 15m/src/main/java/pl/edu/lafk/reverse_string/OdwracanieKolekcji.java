package pl.edu.lafk.reverse_string;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Odwracamy napis przez odwracanie kolekcji.
 * Dużo przepakowań z racji na limity API Stringa:
 * nie ma ładnego przejścia z napisu do listy znaków czy vice versa. :/
 *
 * @see java.util.Collections#reverse(List)
 * @author Tomasz @LAFK_pl Borek
 */
class OdwracanieKolekcji {

    public static void main(String[] args) {
        System.out.println(new OdwracanieKolekcji().odwróć("a b c"));
        System.out.println(new OdwracanieKolekcji().odwróć("abra kadabra hokus pokus"));
        System.out.println(new OdwracanieKolekcji().odwróć("heflew ehfwewrw wlerw wlerw"));
    }

    String odwróć(String napis) {
        final List<String> words = Arrays.asList(napis.split(" "));
        Collections.reverse(words);
        return String.join(" ", words);
        // return words.stream().reduce("", (i, j) -> i.concat(" ").concat(j)).strip();
    }
}
