class Solution {
    public int missingNumber(int[] nums) {
        // int n = nums.length;
        // Arrays.sort(nums);
        // int k=0;
        // for(int i=0; i<n; i++)
        // {
        //     if(nums[i] != k)
        //     {
        //         return k;
        //     }
        //     else if(i<n && i != n-1)
        //     {
        //         k++;
        //     }
        // }
        // return ;

        int n=nums.length;
        int sum=0;
        for(int i=0; i<nums.length; i++)
        {
            sum = sum + nums[i];
        }
        int totalsum=0;
        for(int i=0; i<=n; i++)
        {
            totalsum+=i;
        }
        return totalsum-sum;
    }
}
