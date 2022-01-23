class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()<=1)
        {
            return true;
        }
        
       String reverseString = "";
       s = s.toLowerCase().replaceAll("[^a-z0-9A-Z]", "");
   
       for(int i = s.length() -1 ; i>=0; i--){
           reverseString = reverseString + s.charAt(i);
        }
        if(s.equals(reverseString))
           return true;
       else
          return false;
        
    }
}