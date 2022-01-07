class Solution {
    public void moveZeroes(int[] arr) {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr[count++]=arr[i];
            }
        }
        for(int j=count;j<arr.length;j++)
        {
            arr[count++]=0;
        }
        
    }
}