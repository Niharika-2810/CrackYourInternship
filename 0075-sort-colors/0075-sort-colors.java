class Solution {
    public void sortColors(int[] nums) {
        int zero = 0,one =0,two =0;
        int j=0; 
        for(int i = 0;i<nums.length;i++)
        {
            if(nums[i] == 0)
            zero++;
            else
            if(nums[i] == 1)
            one++;
            else
            two++;
        }
        while(j<zero)
        {
            nums[j] = 0;
            j++;
        }
        while(j<zero+one)
        {
            nums[j] = 1;
            j++;
        }
        while(j<zero+one+two)
        {
            nums[j] = 2;
            j++;
        }
    }
}