package pl.edu.lafk.leetcode;

import java.util.Collections;
import java.util.EmptyStackException;
import java.util.Set;
import java.util.Stack;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 *
 * @author LAFK_pl, Tomasz.Borek@gmail.com
 * @see <A href="https://leetcode.com/explore/featured/card/top-interview-questions-easy/99/others/721/">Task page on LeetCode</A>
 */
class EasyInterviewValidParenthesis {

  private static final Set<Character> OPENINGS = Set.of('(', '[', '{');
  private static final Set<Character> CLOSINGS = Set.of(')', ']', '}');

  public static void main(String[] args) {
    Stream<String> happyPath = Stream.of("[]()", "[]{}", "{}()", "()[]{}", "{[]}", "{()}");
    Stream<String> borderPath = Stream.of("()", "[]", "{}");
    Stream<String> illegalChars = Stream.of("a", "0", ",", "()a", "[0]{}", "{[,.]+-*/}");
    Stream<String> unhappyPath = Stream.of("", "null", "]", "}", ")", "(", "{", "(]", "[)", "{]", "([)]", "([]){");

    Consumer<String> testResultPrinter = s -> System.out.format("Input: %s. Output: %s.%n", s, isValid(s));
    Stream.concat(happyPath,borderPath).forEach(testResultPrinter);
    Stream.concat(unhappyPath,illegalChars).forEach(testResultPrinter);
  }

  private static boolean isValid(String s) {
    Stack<Character> open = new Stack<>();
    Stack<Character> close = new Stack<>();
    for (char c : s.toCharArray()) {
      if (OPENINGS.contains(c)) {
        open.push(c);
      } else if (CLOSINGS.contains(c)) {
        close.push(c);
      } else return false;
    }
    while (open.size() > 0 && close.size() > 0) {
      if (areMatching(close.pop(), open.pop())) return false;
    }
    System.out.println(open);
    System.out.println(close);
    return open.size() == 0 || close.size() == 0;
  }

  private static boolean areMatching(Character close, Character open) {
    return switch (close) {
      case '}' -> open == '{';
      case ')' -> open == '(';
      case ']' -> open == '[';
      default -> false;
    };
  }

}
