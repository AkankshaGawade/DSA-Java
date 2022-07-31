class Solution {
    public int subarraySum(int[] nums, int k) {
    
         Map<Integer,Integer> a = new HashMap();
        
    a.put(0,1);   
int ans=0,sum=0;
        
     for(int i=0;i<nums.length;i++){
         sum+=nums[i];
        if(a.containsKey(sum-k)){
            ans+=a.get(sum-k);
        } 
         a.put(sum,a.getOrDefault(sum,0)+1);
     }   
       return ans; 

    }
}