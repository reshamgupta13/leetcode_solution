class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int res=0;
        int count=0;
        for(int i:nums){
            res+=i;
            if(res==0){
                 count++;
            }
        }
        return count;
    }
}