package pl.edu.lafk.leetcode;

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
    Stream<String> happyPath = Stream.of("[]()", "[]{}", "{}()", "()[]{}", "{[]}");
    Stream<String> borderPath = Stream.of("()", "[]", "{}");
    Stream<String> illegalChars = Stream.of("a", "0", ",", "()a", "[0]{}", "{[,.]+-*/}");
    Stream<String> unhappyPath = Stream.of("", "null", "]", "}", ")", "(", "{", "(]", "[)", "{]", "([)]", "{()}", "([]){");

    Consumer<String> testResultPrinter = s -> System.out.format("Input: %s. Output: %s.%n", s, isValid(s));
    Stream.concat(happyPath,borderPath).forEach(testResultPrinter);
    Stream.concat(unhappyPath,illegalChars).forEach(testResultPrinter);
  }

  private static boolean isValid(String s) {
    boolean result = false;
    Stack<Character> stack = new Stack<>();
    for (char c : s.toCharArray()) {
      if (OPENINGS.contains(c)) {
        stack.push(c);
      } else if (CLOSINGS.contains(c)) {
        try {
          result = matchesPreviousOpening(c, stack.pop());
        } catch (EmptyStackException ese) {
          result = false; break;
        }
        if (!result) break;
      } else {
        result = false; break;
      }
    }
    if (stack.size() > 0) result = false;
    return result;
  }

  private static boolean matchesPreviousOpening(char c, Character poppedOpening) {
    return switch (c) {
      case '}' -> poppedOpening == '{';
      case ')' -> poppedOpening == '(';
      case ']' -> poppedOpening == '[';
      default -> false;
    };
  }

}
