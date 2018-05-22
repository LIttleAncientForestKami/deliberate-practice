package pl.edu.lafk.colours;

/**
 * Paints String in a passed colour.
 * TODO: Once CodingBat and the others switch to JDK9 - change this to an interface.
 * TODO: think if I want more out of it?
 * @see <a href="https://gist.github.com/dainkaplan/4651352" target="_top">Dain Kaplan's gist - nice idea to combine codes</a>
 * @see <a href="https://stackoverflow.com/a/45444716/999165" target="_top">Full code list</a>
 * @see <a href="https://fusesource.github.io/jansi/documentation/api/index.html" target="_top">JANSI library</a>
 */
public class Painter {

    private static String colourize(ANSI code, String s) {
        return code + s + ANSI.RESET;
    }

    public static String red(String s) {
        return colourize(ANSI.RED, s);
    }

    public static String yellow(String s) {
        return colourize(ANSI.YELLOW, s);
    }

    public static String green(String s) {
        return colourize(ANSI.GREEN, s);
    }

    public static void main(String[] args) {
        System.out.println(red("error"));
        System.out.println(yellow("warning"));
        System.out.println(green("success"));
    }
}
