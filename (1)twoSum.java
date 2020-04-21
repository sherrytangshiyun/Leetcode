class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] num = {0,0};
        for(int i = 0;i<nums.length;i++){
            int chazhi = target-nums[i];
            for(int j = 0;j<nums.length;j++){
                if(chazhi==nums[j]&&i!=j){
                    num[0] = i;
                    num[1] = j;  
                    break;
                }
                    
            }
            if(num[0]!=0&&num[1]!=0){
                break;
            }
            
        }
        return num;
        
    }
}