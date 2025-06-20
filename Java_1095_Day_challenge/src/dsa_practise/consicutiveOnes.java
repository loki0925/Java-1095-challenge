package dsa_practise;

public class consicutiveOnes {

	
	    // Method to find max consecutive 1s
	    public static int findMaxConsecutiveOnes(int[] nums) {
	        int maxCount = 0;
	        int count = 0;

	        for (int num : nums) {
	            if (num == 1) {
	                count++;
	                maxCount = Math.max(maxCount, count);
	            } else {
	                count = 0;
	            }
	        }

	        return maxCount;
	    }

	    // Main method
	    public static void main(String[] args) {
	        int[] nums = {1, 1, 0, 1, 1, 1};
	        int result = findMaxConsecutiveOnes(nums);
	        System.out.println("Maximum number of consecutive 1s: " + result);
	    }
	}

