class Solution {
    public String longestCommonPrefix(String[] strs) {
       Arrays.sort(strs); 
       String first= strs[0];
       String last= strs[strs.length-1];
       int len=0;
       while(len < first.length() && len < last.length())
       {
        if(first.charAt(len)==last.charAt(len))
        len++;
        else
        break;
        
       }
       return first.substring(0,len); 
    }
}
