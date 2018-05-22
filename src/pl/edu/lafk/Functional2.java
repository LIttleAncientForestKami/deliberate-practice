package pl.edu.lafk;

import java.util.List;

public class Functional2 {

    //f2
    public List<Integer> noNeg(List<Integer> nums) {
        nums.removeIf(n -> n<0);
        return nums;
    }

}
