package com.mithun.leetcode75.prefixsum;

public class program724 {
    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        int sum = 0;
        for(int num:nums){
            sum+=num;
        }
        int leftsum=0;
        for(int i=0;i<nums.length;i++){
            sum-=nums[i];
            if(leftsum==sum){
                System.out.println(i);
                break;
            }
            leftsum+=nums[i];
        }
    }
}
