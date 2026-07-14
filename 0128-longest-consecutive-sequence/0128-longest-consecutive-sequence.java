class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums==null || nums.length==0){
            return 0;
        }
            Set<Integer> numSet=new HashSet<>();
            for(int num:nums){
                numSet.add(num);
            }
            int LongestStreak=0;
            for(int num: numSet){
                if(!numSet.contains(num-1)){
                    int currNum=num;
                    int currStr=1;
                    while(numSet.contains(currNum+1)){
                        currNum+=1;
                        currStr+=1;
                    }
                    LongestStreak=Math.max(LongestStreak, currStr);
                }
            }
        return LongestStreak;
    }
}