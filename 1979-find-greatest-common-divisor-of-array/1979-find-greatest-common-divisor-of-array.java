class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int n=nums[0], m=nums[nums.length-1];
         while (m != 0) {
            int temp = m;
            m = n % m;
            n = temp;
        }
        return n;
    }
}