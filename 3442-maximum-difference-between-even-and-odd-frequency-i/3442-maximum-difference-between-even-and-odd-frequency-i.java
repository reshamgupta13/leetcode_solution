class Solution {
    public int maxDifference(String s) {
        HashMap<Character, Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        int maxOdd=Integer.MIN_VALUE;
        int minEven=Integer.MAX_VALUE;
        for(int count:map.values()){
            if(count%2==1){
                maxOdd=Math.max(maxOdd,count);
            }
            else{
                minEven=Math.min(minEven,count);
            }
        }
return maxOdd-minEven;
    }
}