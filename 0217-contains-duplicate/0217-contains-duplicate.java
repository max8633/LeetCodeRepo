class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> dupNum = new HashSet<>();

        for(int num:nums){
            if(dupNum.contains(num)) {
                return true;
            }
            dupNum.add(num);
        }

        return false;
    }
}