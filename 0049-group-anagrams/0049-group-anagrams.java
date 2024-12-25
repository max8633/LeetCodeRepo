class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> matchMap = new HashMap<>(); 
        for( String s: strs) {
            /* following using sort */
            // char[] charArray = s.toCharArray();
            // Arrays.sort(charArray);
            // String sortedString = new String(charArray);
            // matchMap.putIfAbsent(sortedString, new ArrayList<>());
            // matchMap.get(sortedString).add(s);
            /* end */

            int[] countChar = new int[26];
            for (char currChar: s.toCharArray()) {
                //if c is 'a' then 'a'-'a' is 0 = countChar[0] = number of 'a'
                countChar[currChar -'a']++;
            }
            String key = Arrays.toString(countChar);
            matchMap.putIfAbsent(key, new ArrayList<>());
            matchMap.get(key).add(s);            
        }
        return new ArrayList<>(matchMap.values());
    }
}
