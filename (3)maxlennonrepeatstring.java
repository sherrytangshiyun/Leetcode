//hashmap+滑动窗口
//一开始用的list，但是在删除时，list元素索引发生改变，记录长度容易出错

class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        char[] c = s.toCharArray();

        HashMap<Character,Integer> hs = new HashMap<>(); //当前窗口
        
        int l = 0;
        int r = 0;
        int maxlength = r-l;

        for(int j = 0; j < c.length; j++)
        {
              
              if(hs.containsKey(c[j]))
              {
                  
                  maxlength = Math.max(maxlength,r-l);
                  int index = hs.get(c[j]);
                  hs.put(c[j],j);
                  for(int i = l; i<=index ; i++)
                      hs.remove(c[i]);
                  l = index + 1;
                 
              }
               hs.put(c[j],j);
               r++;
        }
        return Math.max(maxlength,r-l);
    }
}