class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> matchMap = new HashMap<>(); 
        for( String s: strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);
            matchMap.putIfAbsent(sortedString, new ArrayList<>());
            matchMap.get(sortedString).add(s);
        }
        return new ArrayList<>(matchMap.values());
    }
}