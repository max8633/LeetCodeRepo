class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        List<Integer>[] bucket = new List[nums.length + 1];

        for(int num:nums){
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        for(int key:freqMap.keySet()){
            int freq = freqMap.get(key);
            if(bucket[freq]==null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        int[] result = new int[k];
        int counter = 0;

        for(int freq = bucket.length - 1; freq >= 0 && counter < k; freq--){
            if(bucket[freq] != null) {
                for(int i: bucket[freq]){
                    result[counter++] = i;
                }
            }
        }
        return result;        
    }
}