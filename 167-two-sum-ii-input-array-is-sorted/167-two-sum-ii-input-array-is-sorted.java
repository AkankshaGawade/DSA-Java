class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int result[]=new int[2];
        int left=0,right=numbers.length-1;
        
        while(left<right){
            int start=numbers[left];
            int end=numbers[right];
            
            if(start+end==target){
                result[0]=left+1;
                result[1]=right+1;
                break;
            }
            else if(start+end<target){
                left++;
            }
            else right--;
        }
        return result;
    }
}