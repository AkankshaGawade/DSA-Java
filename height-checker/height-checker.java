class Solution {
    public int heightChecker(int[] heights) {
         int count = 0;
        if (heights == null || heights.length == 0) return count;
        int len = heights.length;
        int[] newArr = new int[heights.length];
        System.arraycopy(heights, 0, newArr, 0, len);
        Arrays.sort(newArr);
        for (int i = 0; i < len; i++) {
            if (newArr[i] != heights[i])
                count++;
        }
        return count;
    }
}