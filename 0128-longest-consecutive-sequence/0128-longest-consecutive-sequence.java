class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet();
        
        for(int num: nums){
            set.add(num);
        }

        int longestLength = 0;

        for(int num: set){
            if(!set.contains(num-1)){
                int currLength = 1;
                while(set.contains(num+currLength)) {
                    currLength++;
                }
                longestLength = Math.max(longestLength,currLength);
            }
        }

        return longestLength;
    }
}