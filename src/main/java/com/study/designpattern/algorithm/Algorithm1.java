package com.study.designpattern.algorithm;

import java.util.Arrays;

/**
 * @author cx
 * @date 2022/8/30 003014:52
 */
public class Algorithm1 {

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int[] ints = searchRange(nums, 8);
        Arrays.stream(ints).forEach(System.out::println);
    }
    public static int[] searchRange(int[] nums, int target) {
        int l = search(nums, target);
        int r = search(nums, target + 1);
        return l == nums.length || l >= r ? new int[]{-1, -1} : new int[]{l, r - 1};
    }

    /**
     * 二分查找,从左往右找
     * @param nums
     * @param target
     * @return
     */
    public static int search(int[] nums,int target){

        int left = 0;
        int right = nums.length;
        while (left < right){
            int mod = (left + right) >>> 1;
            if(nums[mod] >= target){
                right = mod;
            }else {
                left = mod + 1;
            }
        }
        return left;
    }

}
