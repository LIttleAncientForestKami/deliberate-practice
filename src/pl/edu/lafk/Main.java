package pl.edu.lafk;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    // klasa : metoda : parametr -> wynik (czerwo lub zielo?)
    public static void main(String[] args) {
        final Main main = new Main();
        Stream<Method> methodStream = Arrays.stream(Functional1.class.getDeclaredMethods()).filter(m -> m.getModifiers() == 1);
        Arrays.stream(Functional1.class.getDeclaredMethods()).filter(m -> m.getModifiers() == 1)
                .filter(m -> m.getGenericParameterTypes()[0].getTypeName().equalsIgnoreCase("java.util.List<java.lang.String>"))
                .forEach(m -> System.out.println(String.format("%s: %s", m.getName(), invoke(m, new Functional1(), main.strings()))));

    }

    private static List<String> invoke(Method m, Functional1 c, List<String> param) {
        try {
            return (List<String>) m.invoke(c, param);
        } catch (IllegalAccessException|InvocationTargetException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    List<Integer> ints() {
        List<Integer> ints = IntStream.of(1, 22, 103, 16, 8, 886, 8, 1, 10, 0).boxed().collect(Collectors.toList());
        return ints;
    }
    List<String> strings() {
        List<String> strings = new ArrayList();
        strings.add("x");
        strings.add("xax");
        strings.add("xbxb");
        strings.add("abc def");
        return strings;
    }
}
