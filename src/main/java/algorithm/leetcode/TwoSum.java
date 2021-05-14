package algorithm.leetcode;

import java.util.Arrays;

/**
 * 1. Two Sum
 *
 * <p>Given an array of integers nums and an integer target, return indices of the two numbers such
 * that they add up to target.
 *
 * <p>You may assume that each input would have exactly one solution, and you may not use the same
 * element twice.
 *
 * <p>You can return the answer in any order.
 */
public class TwoSum {

    /**
     * Return indices of the two numbers such that they add up to target.
     * @param numArray
     * @param target
     * @return
     */
    public static int[] twoSum(int[] numArray, int target) {
        for(int i=0; i < numArray.length; i++) {
            for(int j= i + 1; j < numArray.length; j++) {
                if(numArray[i] + numArray[j]  == target) {
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int [] numArray = {3,2,4};
        int target = 6;
        System.out.println("Output index (1,2) => (2,4) = " + Arrays.toString(twoSum(numArray, target)));
    }
}
