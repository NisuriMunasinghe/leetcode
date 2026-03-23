class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i < nums.length; i++){
            int compliment = target-nums[i];
            if (map.containsKey(compliment)){
                output[0]=map.get(compliment);
                output[1]=i;
                return output;
            }
            map.put(nums[i],i);
        }
        return output;
    }
}