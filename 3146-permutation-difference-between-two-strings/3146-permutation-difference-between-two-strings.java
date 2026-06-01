class Solution {
    public int findPermutationDifference(String s, String t) {
     int m=s.length();
     int n=t.length();
     int res=0;
    for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
                if(s.charAt(i)==t.charAt(j)){
               res+=Math.abs(i-j);
            }
        }
    }
    return res;
    }
}