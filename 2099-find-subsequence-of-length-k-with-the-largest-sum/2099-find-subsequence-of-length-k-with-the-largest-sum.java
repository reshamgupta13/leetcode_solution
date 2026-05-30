class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;

        int[] temp = nums.clone();
        Arrays.sort(temp);

        HashMap<Integer, Integer> map = new HashMap<>();

        // Store largest k elements
        for (int i = n - k; i < n; i++) {
            map.put(temp[i], map.getOrDefault(temp[i], 0) + 1);
        }

        int[] ans = new int[k];
        int idx = 0;

        // Preserve original order
        for (int num : nums) {
            if (map.getOrDefault(num, 0) > 0) {
                ans[idx++] = num;
                map.put(num, map.get(num) - 1);

                if (idx == k) break;
            }
        }

        return ans;
    }
}