class Solution {
    public int majorityElement(int[] nums) {
       int count=0, cand=0;
       for(int num:nums){
        if(count==0){
            cand=num;
        }
        if(cand==num){
            count++;
        }
        else{
            count--;
        }
       }
       return cand;
    }
}