class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){ 
            return false;
        }

        HashMap<Character, Integer> S = new HashMap<Character, Integer>();
        HashMap<Character, Integer> T = new HashMap<Character, Integer>();

        for ( int i = 0; i < s.length(); i++) {
            S.put(s.charAt(i), S.getOrDefault(s.charAt(i), 0) +1);
            T.put(t.charAt(i), T.getOrDefault(t.charAt(i), 0) +1);
        }
        return S.equals(T);
    }
}