package pl.edu.lafk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Logger;

/**
 * Names other classes here
 *
 * @author Tomasz @LAFK_pl Borek
 */
class Main {

    private static final Logger LOGGER = Logger.getLogger("Deliberate-Practice-15m");

    public static void main(String[] args) {
        System.out.println("Welcome to deliberate practice repository, 1 hour section");
        System.out.println("It's focus: tasks to do under 1 hour");
        System.out.println("Examples include");
        try {
            final Process ls = new ProcessBuilder().command("zsh", "-c", "ls -la src/**/*.java").start();
            final InputStream inputStream = ls.getInputStream();
            System.out.println("inputStream.available() = " + inputStream.available());
            final BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            br.lines().forEach(System.out::println);
        } catch (IOException e) {
            LOGGER.severe(e.getMessage());
        }
    }
}
