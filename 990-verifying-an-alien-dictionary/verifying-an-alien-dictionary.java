class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] charMap = new int[26];
        for (int i = 0; i < order.length(); i++) {
            charMap[order.charAt(i) - 'a'] = i;
        }
        
        for (int i = 0; i < words.length - 1; i++) {
            if (!isOrdered(words[i], words[i + 1], charMap)) {
                return false;
            }
        }
        return true;
    }
    
    private boolean isOrdered(String word1, String word2, int[] charMap) {
        int minLength = Math.min(word1.length(), word2.length());
        
        for (int i = 0; i < minLength; i++) {
            char c1 = word1.charAt(i);
            char c2 = word2.charAt(i);
            
            if (c1 != c2) {
                
                return charMap[c1 - 'a'] < charMap[c2 - 'a'];
            }
        }
        
        return word1.length() <= word2.length();
    }
}