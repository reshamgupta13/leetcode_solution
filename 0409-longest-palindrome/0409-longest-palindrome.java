class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> charFreq=new HashMap<>();
        int oddFreqCount=0;
        for(char ch: s.toCharArray()){
            charFreq.put(ch,charFreq.getOrDefault(ch,0)+1);
            if(charFreq.get(ch)%2==1)
            oddFreqCount++;
            else
            oddFreqCount--;
        }
        if(oddFreqCount>1)
        return s.length()-oddFreqCount+1;
        return s.length();
    }
}