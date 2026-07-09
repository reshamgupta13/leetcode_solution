class Solution {
    public int findDuplicate(int[] nums) {
        int res=0;
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i++){
            if(nums[i]==nums[i-1]){
                res=nums[i];
            }
        }
        return res;
    }
}