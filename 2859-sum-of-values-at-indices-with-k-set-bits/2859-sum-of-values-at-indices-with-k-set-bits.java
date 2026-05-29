class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int n=nums.size();
        int ans=0;
        for(int i=0; i<n; i++){
            if(getBit(i)==k)ans+=nums.get(i);
        }
        return ans;
    }
    int getBit(int num){
        int bitcount=0;
        while(num>0){
            if((num&1)==1){
                bitcount++;
            }
            num=num>>1;
        }
        return bitcount;
    }
}