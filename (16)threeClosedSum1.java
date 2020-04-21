
//暴力解法，三重循环
//效率不高，时间很慢
class Solution {
    public int threeSumClosest(int[] nums, int target) {
    List<Integer> ls = new ArrayList<>();
    for(int i = 0; i < nums.length; i++)
    {
        for(int j = i+1;j < nums.length; j++)
        {
            for(int k = j+1; k < nums.length; k++)
            {
               ls.add(nums[i]+nums[j]+nums[k]);
            }
        }
    }
    int min = ls.get(0)-target;
    int value = 0;
    for(int i = 1; i<ls.size(); i++)
    {
           value = ls.get(i)-target;
           if(Math.abs(min)>Math.abs(value))
               min = value;
    }
    return min+target;
    }
}