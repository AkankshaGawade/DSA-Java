class Solution {
    public int findPairs(int[] nums, int k) {
       Set<Integer> uniquePair = new HashSet();
 		Arrays.sort(nums);
 		int n = nums.length;

 		for (int i = 0; i < n - 1; i++)
 			if (Arrays.binarySearch(nums, i + 1, n, nums[i] + k) > 0)
 				uniquePair.add(nums[i]);

 		return uniquePair.size(); 
    }
}