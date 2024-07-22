package com.mithun.leetcode.arraysstrings;
import java.util.*;
public class program1431 {
    public static void main(String[] args) {
        int[] candies = {1,7,1,8,4,2,1,1};
        int extraCandies = 1;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] >= max) {
                max = candies[i];
            }
        }

        List<Boolean> output = new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            if(extraCandies+candies[i]>=max){
                output.add(true);
            }
            else {
                output.add(false);
            }
        }

        System.out.println(output);
    }
}
