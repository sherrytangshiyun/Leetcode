//������
//ѭ��һ�Ρ�ÿ��ѭ��ɨ�赱ǰֵ��������С�
//��������е�һλ�����һλ��������ָ�룬�����С��target����ָ������һλ������//��ָ������һλ���������������ǰ��
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