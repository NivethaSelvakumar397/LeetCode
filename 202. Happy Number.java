class Solution {
    public boolean isHappy(int n) {
        
        while(n>9)
        { 
            int x=0;
            while(n!=0){
            int a = n%10;
                n/=10;
                x += (a*a);
            
        }n=x;
        }
        if(n==1||n==7)
        return true;
        else return false;
    }
}
