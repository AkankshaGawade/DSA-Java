class Solution {
    public String reversePrefix(String word, char ch) {
        int left =0;
        int right = word.indexOf(ch,0);
        
        char words[] = word.toCharArray();
        
        while(left<right)
        {
            char temp = words[left];
            words[left]=words[right];
            words[right]=temp;
            left++;
            right--;
            
        }
        
        return new String(words);
    }
}