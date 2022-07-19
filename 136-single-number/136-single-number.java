class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int j;
            for(j=0;j<n;j++){
                if(i!=j && nums[i]==nums[j])
                    break;
            }
            if(j==n){
                return nums[i];
            }
        }
        return -1;
    }
}