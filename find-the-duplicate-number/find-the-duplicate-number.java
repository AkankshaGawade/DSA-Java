class Solution {
    public int findDuplicate(int[] nums) {
    
        // create a k array of size `n+1`
        // we can also use a map instead of a k array
        boolean k[] = new boolean[nums.length + 1];
 
        // mark each array element as visited and
        // return it if seen before
        for (int value: nums)
        {
            // if the element is seen before
            if (k[value]) {
                return value;
            }
 
            // mark element as visited
            k[value] = true;
        }
 
        // no duplicate found
        return -1;
    }
}