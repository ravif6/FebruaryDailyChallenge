class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n=nums.length;
       int[]  dp = new int[n+1];
       int[] prev = new int[n+1];
       Arrays.fill(prev,-1);
       Arrays.sort(nums);
       int max_value=0,max_index=0;
       for(int i=0;i<n;i++)
       {
           for(int j=0;j<i;j++)
           {
               if(nums[i]%nums[j]==0){
                   if (dp[i] < (dp[j]+1)){
                       dp[i] = dp[j] +1;
                       prev[i] = j;
                   }
               }
           }
            if (max_value < dp[i]){
                   max_index = i;
                   max_value = dp[i];
               }
       }
       List<Integer> result = new ArrayList<>();
       while(max_index!=-1){
           result.add(0,nums[max_index]);
           max_index = prev[max_index];
       }
       return result;
    }
}