package pl.edu.lafk;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Functional1 {

    public List<Integer> math1(List<Integer> nums) {
        nums.replaceAll(i -> 10 * (i + 1));
        return nums;
    }

    //http://codingbat.com/prob/p117665
    public List<Integer> doubling(List<Integer> nums) {
        nums.replaceAll(n -> n * 2);
        return nums;
    }

    //http://codingbat.com/prob/p181634
    public List<String> copies3(List<String> strings) {
        strings.replaceAll(s -> s + s + s);
        return strings;
    }

    //http://codingbat.com/prob/p139586
    public List<Integer> square(List<Integer> nums) {
        nums.replaceAll(i -> i * i);
        return nums;
    }

    //http://codingbat.com/prob/p177528
    public List<String> moreY(List<String> strings) {
        strings.replaceAll(s -> "y" + s + "y");
        return strings;
    }

    //http://codingbat.com/prob/p170181
    public List<String> addStar(List<String> strings) {
        strings.replaceAll(s -> s + "*");
        return strings;
    }

    //http://codingbat.com/prob/p152194
    public List<Integer> rightDigit(List<Integer> nums) {

        return nums.stream().map(i -> {
            while (i >= 10) {
                i = i % 10;
            }
            return i;
        }).collect(Collectors.toList());
    }

    //http://codingbat.com/prob/p105967
    public List<String> noX(List<String> strings) {
        strings.replaceAll(s -> s.contains("x") ? s.replaceAll("x", "") : s);
        return strings; // same as strings(), sort it out
    }
}