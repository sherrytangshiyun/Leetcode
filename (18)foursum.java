import java.util.*;

public class threeClosedSum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ls = new ArrayList<>();
        Arrays.sort(nums);
        if(nums ==null || nums.length<4)
            return ls;
        int minvalue = nums[0]+nums[1]+nums[2]+nums[3];
        int maxvalue = nums[nums.length-1]+nums[nums.length-2]+nums[nums.length-3]+nums[nums.length-4];
        if(maxvalue<target|| minvalue>target)
            return ls;

        for(int i = 0;i < nums.length-3;i++)
        {
            for(int j = i+1; j < nums.length-2; j++)
            {
                if(i==0 || j==0 ||(i > 0 && nums[i]!= nums[i-1])||(j > i+1 && nums[j] != nums[j-1]))
                {
                    int l = j+1;
                    int r = nums.length-1;

                    while(l<r){
                        int chazhi = target-(nums[l]+nums[r]);
                        if(chazhi == (nums[i]+nums[j]))
                        {
                            ls.add(Arrays.asList(nums[i],nums[j],nums[l],nums[r]));
                            while(l<r&&(nums[l] == nums[l+1])){
                                l++;
                            }

                            while(l<r&&(nums[r] == nums[r-1])){
                                r--;
                            }
                            l++;
                            r--;
                        }

                        else if(chazhi<(nums[i]+nums[j]))
                        {
                            while(l<r&&(nums[r]==nums[r-1]))
                            {
                                r--;
                            }
                            r--;
                        }
                        else{
                            while(l<r&&(nums[l] == nums[l+1])){
                                l++;
                            }
                            l++;
                        }
                    }
                }
            }
        }
        return ls;
    }

    public static void main(String[] args) {
        int[] nums = {-3,-2,-1,0,0,1,2,3};
        int target = 0;
        List<List<Integer>> ls = new ArrayList<>();
        Set<List<Integer>> se = new HashSet<>();
        List<List<Integer>> re = new ArrayList<>();
        ls = fourSum(nums,target);
        for(int i = 0 ; i < ls.size(); i++){
            if(se.add(ls.get(i)))
                re.add(ls.get(i));
        }

        for(List<Integer> result:re)
            System.out.println(result);
    }
}