class Solution {
    public void reverseString(char[] s) {
        int a=s.length-1;
        int i=0;
        while(i<=a){
            char temp=s[i];
            s[i]=s[a];
            s[a]=temp;
            
            a--;
            i++;
        }
    }
}