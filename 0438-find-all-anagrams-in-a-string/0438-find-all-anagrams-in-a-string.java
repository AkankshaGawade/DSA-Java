class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s == null || s.length() == 0 || s.length() < p.length()) {
            return result;
        }

        int[] hashP = new int[26];
        int[] hashS = new int[26];
  
        for (int i = 0; i < p.length(); i++) {
            hashP[p.charAt(i) - 'a']++;
        }
        for (int i = 0; i < p.length(); i++) {
            hashS[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length() - p.length(); i++) {
            if (isMatch(hashP,hashS)) {
                result.add(i);
            }
           
            hashS[s.charAt(i+p.length()) - 'a']++;
            hashS[s.charAt(i) - 'a']--;
        }
        if (isMatch(hashP, hashS)) {
            result.add(s.length() - p.length());
        }
        return result;
    }

    public boolean isMatch(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    
    }
}