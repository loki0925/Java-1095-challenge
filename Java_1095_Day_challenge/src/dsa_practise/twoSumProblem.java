package dsa_practise;

import java.util.Arrays;
import java.util.HashMap;

public class twoSumProblem {
    public static int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums); // If not already sorted
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == target) {
                return new int[] {nums[left], nums[right]};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return null; 
    }
    public static int[] twoSumBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { nums[i], nums[j] };
                }
            }
        }
        return null;
    }
    public static int[] twoSumHashMap(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int complement = target - num;
            if (map.containsKey(complement)) {
                return new int[] { complement, num };
            }
            map.put(num, 1); 
        }
        return null;
    }
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(arr, target);
        int[] result2 = twoSumBruteForce(arr, target);
        int[] result3 = twoSumHashMap(arr, target);
        if (result != null)
            System.out.println("Pair: " + result[0] + ", " + result[1]);
        else
            System.out.println("No pair found");
       
        if (result2 != null)
            System.out.println("Pair: " + result[0] + ", " + result[1]);
        else
            System.out.println("No pair found");
        
        if (result3 != null)
            System.out.println("Pair: " + result[0] + ", " + result[1]);
        else
            System.out.println("No pair found");
    }
}

