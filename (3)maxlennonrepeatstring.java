//hashmap+��������
//һ��ʼ�õ�list��������ɾ��ʱ��listԪ�����������ı䣬��¼�������׳���

class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        char[] c = s.toCharArray();

        HashMap<Character,Integer> hs = new HashMap<>(); //��ǰ����
        
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