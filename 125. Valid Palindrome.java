class Solution {
    public boolean isPalindrome(String s) {
        s= s.replaceAll("\\s","");
        //s = s.replaceAll("[-+.^:,@!#[$%^]&*()_{}]", "");
        s = s.replaceAll(
          "[^a-zA-Z0-9]", "");
        s=s.trim().toLowerCase();
        String reverse="";
            System.out.println(s);
        for(int i=s.length()-1;i>=0;i--)
        {
            reverse=reverse+s.charAt(i);
            
        }
        System.out.println(reverse);
        if(reverse.equals(s))
        return true;
        else
        return false;
    }
}
