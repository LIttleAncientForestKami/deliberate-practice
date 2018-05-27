package pl.edu.lafk;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Functional2 {

    //http://codingbat.com/prob/p103456
    public List<Integer> noNeg(List<Integer> nums) {
        nums.removeIf(n -> n<0);
        return nums;
    }

    //http://codingbat.com/prob/p124510
    public List<Integer> no9(List<Integer> nums) {
        nums.removeIf(n -> n%10 == 9);
        return nums;
    }

    //http://codingbat.com/prob/p137274
    public List<Integer> noTeen(List<Integer> nums) {
        nums.removeIf(n-> n>=13 && n<=19);
        return nums;
    }

    //http://codingbat.com/prob/p137274
    public List<String> noLong(List<String> strings) {
        strings.removeIf(s -> s.length()>=4);
        return strings;
    }

    //http://codingbat.com/prob/p194496
    public List<String> noZ(List<String> strings) {
        strings.removeIf(s -> s.contains("z"));
        return strings;
    }

    //http://codingbat.com/prob/p184496
    public List<String> no34(List<String> strings) {
        strings.removeIf(s -> s.length() == 3 || s.length() == 4);
        return strings;
    }

    // no YY sub, all else gets +"y"
    public List<String> noYY_asTextMeantIt(List<String> strings) {
        return strings.stream().filter(s -> !s.contains("yy")).map(s -> s+"y").collect(Collectors.toList());
    }

    //http://codingbat.com/prob/p115967
    public List<String> noYY(List<String> strings) {
        return strings.stream()
                .filter(s -> !s.contains("yy") && !s.endsWith("y"))
                .map(s -> s+"y")
                .collect(Collectors.toList());
    }

    //http://codingbat.com/prob/p148198 - I read it without "resulting"
    public List<Integer> two2_asIReadIt(List<Integer> nums) {
        nums.removeIf(n -> n%10 == 2);
        nums.replaceAll(n -> n*2);
        return nums;
    }

    //http://codingbat.com/prob/p148198
    public List<Integer> two2(List<Integer> nums) {
        nums.replaceAll(n -> n*2);
        nums.removeIf(n -> n%10 == 2);
        return nums;
    }

    //http://codingbat.com/prob/p132748
    public List<Integer> square56(List<Integer> nums) {
        nums.replaceAll(n -> n*n+10);
        nums.removeIf(n -> n%10 == 6 || n%10 == 5);
        return nums;
    }

}
