class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ch1=new char[s.length()];
        char[] ch2=new char[t.length()];
        boolean flag= false;
         if(s.length()!=t.length())
         {
         return false;
         }
        for(int i=0;i<s.length();i++)
        {
            ch1[i]=s.charAt(i);
        }
         for(int j=0;j<t.length();j++)
        {
            ch2[j]=t.charAt(j);
        }
     Arrays.sort(ch1);
     Arrays.sort(ch2);

    
return Arrays.equals(ch1, ch2);
          
    }
}
