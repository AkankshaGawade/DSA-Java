class Solution {
    public int maxProduct(int[] nums) {
      int result=nums[0];
        for(int i=0;i<nums.length;i++){
            int p=nums[i];
            for(int j=i+1;j<nums.length;j++){
                result=Math.max(result,p);
                p*=nums[j];
            }
            result=Math.max(result,p);
        }
        return result;
    }
}