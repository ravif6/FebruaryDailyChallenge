class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int diff = right-left,ans=0,curr= 0,idx=0;
        if (left==right)
        return left;
        while(idx<60){
            int temp = 1<<idx;
            if(temp<=left && temp>diff && ((temp-curr)>diff))
            {
                ans|=(left & (1<<idx));
            }
            curr |= (left&(1<<(idx)));
            idx+=1;
        }
        return ans;
    }
}