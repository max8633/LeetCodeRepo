// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int result[] = new int[2];
//         for(int i = 0 ; i < nums.length ; i++){
//             for(int j = i + 1; j < nums.length ; j++) {
//                if(nums[i]+nums[j] == target){
//                     result[0] = i;
//                     result[1] = j;
//                     return result;
//                } 
//             }
//         }return new int[0];
//     }
// }

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> arrayMap = new HashMap<>();

        for (int i = 0; i< nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if (arrayMap.containsKey(diff)) {
                return new int[] {arrayMap.get(diff), i};
            }

            arrayMap.put(num, i);
        }

        return new int[] {};
    }
}
