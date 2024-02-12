class Solution {
    public int majorityElement(int[] nums) {
        int i=1,curr = nums[0],freq =1;
        while(i<nums.length){
            if(nums[i] == curr){
                freq+=1;
            }
            else{
                freq-=1;
            
            if (freq==0)
            {
                curr = nums[i];
                freq=1;
            }
            }
            i+=1;
        }
        return curr;
    }
}