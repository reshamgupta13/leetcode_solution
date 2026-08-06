class Solution {
    public int smallestNumber(int n, int t) {
        while(productofnum(n)%t!=0){
            n++;
        }
        return n;
    }
        private int productofnum(int n){
            int product=1;
            while(n!=0){
                product*=n%10;
                n/=10;
            }
            return product;
        }
    
}