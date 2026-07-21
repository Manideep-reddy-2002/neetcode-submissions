class Solution {
    public int findMin(int[] nums) {

        Arrays.sort(nums);
        int num=nums[0];
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length-1;j++)
            {
                if(nums[i]>nums[j])
                {
                    num=nums[j];
                }
            }
        }
        return num;
    }
}
