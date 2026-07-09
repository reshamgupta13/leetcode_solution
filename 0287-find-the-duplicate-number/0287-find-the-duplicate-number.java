class Solution {
    public int findDuplicate(int[] nums) {
       boolean[] visit=new boolean[nums.length+1];
       for(int num:nums){
        if(visit[num]==true){
            return num;
        }
        else{
            visit[num]=true;
        }
       }
       return 0;
    }
}