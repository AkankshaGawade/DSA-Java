class Solution {
    String[] numBook = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    StringBuilder curResultString = new StringBuilder();
    List<String> result = new ArrayList<>();
    
    public List<String> letterCombinations(String digits)
    {
        if (digits == null || digits.length() == 0)
            return new ArrayList<>();
        
        findCombinations(digits, 0);
        
        return result;
    }
    
    public void findCombinations(String digits, int letter)
    {
        if (letter == digits.length())
        {
            result.add(curResultString.toString());
            return;
        }
        
        String str = numBook[digits.charAt(letter) - '0'];

        for (int i = 0; i < str.length(); i++)
        {
            curResultString.append(str.charAt(i));
            findCombinations(digits, letter + 1);
            curResultString.deleteCharAt(curResultString.length() - 1);
        }
    }
}