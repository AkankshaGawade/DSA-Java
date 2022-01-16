class Solution {
    public String sortSentence(String s) {
        String[] str = s.split(" ");
        String[] ans  = new String[str.length];

        for (int i = 0; i < ans.length; i++) {
            int index = Character.getNumericValue(str[i].charAt( str[i].length()-1 ));
            ans[index-1] = str[i].replace(Character.toString(str[i].charAt( str[i].length()-1 )), "");
            
        }
        StringBuilder sb = new StringBuilder();
            for(int i = 0; i < ans.length; i++) {
            sb.append(ans[i]);
            if(i <= ans.length-2) sb.append(" ");
        }
        return sb.toString(); 
    }
}