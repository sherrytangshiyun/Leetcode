//先排序
//循环一次。每轮循环扫描当前值后面的序列。
//后面的序列第一位和最后一位定义两个指针，如果和小于target则左指针右移一位，否则//左指针左移一位。如果相等则输出当前和
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closedNum = nums[0]+nums[1]+nums[2];
        for( int i = 0; i < nums.length-2; i++)
        {
            int l = i+1;
            int r = nums.length-1;
            while(l<r)
            {
                int value = nums[i]+nums[r]+nums[l];
                if(Math.abs(closedNum-target)>Math.abs(value-target)){
                    closedNum = value;   
                }
                if(value>target)
                    r--;
                else if(value<target){ 
                    l++;    
                }
                else
                    return value;
            }    
        }
        return closedNum;
    }
}