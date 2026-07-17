class Solution {
    public int findDuplicate(int[] nums) {
      boolean[] flag=new boolean[nums.length+1];
      for(int num:nums){
        if(flag[num]==true){
            return num;
        }else{
            flag[num]=true;
        }
      }
      return 0;
    }
}