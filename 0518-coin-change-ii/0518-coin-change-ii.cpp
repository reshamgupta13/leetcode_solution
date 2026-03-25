class Solution {
public:
  int solveRec(vector<int>& coins, int n, int sum){
      if(sum==0) return 1;
      if(sum<0) return 0;
      if(n==0) return 0;
      int exclude=solveRec(coins, n-1,sum);
      int include=solveRec(coins,n,sum-coins[n-1]);
      return exclude+include;
  }
  int solveMem(vector<int>& coins,int n,int amount,vector<vector<int>> &dp){
      if(amount==0) return 1;
      if(amount<0) return 0;
      if(n==0) return 0;
      if(dp[n][amount] != -1) {
          return dp[n][amount];
      }
      int exclude=solveMem(coins, n-1,amount,dp);
      int include=solveMem(coins,n,amount-coins[n-1],dp);
      dp[n][amount]=exclude+include;
      return dp[n][amount];
  }
     int change(int amount, vector<int>& coins) {
        // code 
        int n=coins.size();
        //return solveRec(coins,n,sum);
        vector<vector<int>> dp(n+1, vector<int>(amount+1, -1));
        return solveMem(coins,n,amount,dp);
        
    }
}; 