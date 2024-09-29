class Solution {
    public String reverseWords(String s) {
          String[] words=s.split("\\s+");
          String Reverse="";
        for(int w=words.length-1;w>=0;w--)
        {
          Reverse=Reverse+words[w]+" ";
        }
        return Reverse.trim();
    }
}
