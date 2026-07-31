class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.isEmpty()){
            return true;
        }
        char ch[]=s.toCharArray();
        char ch1[]=t.toCharArray();
        int i=0, j=0;
        while(i<ch.length && j<ch1.length){
            if(ch[i]==ch1[j]){
                i++;
            }
            j++;
        }
    return ch.length==i; 
    }
}