class Solution {
    public double myPow(double x, int n) {
       // double y= Math.pow(x,n);
       double y=1.0;
       if(n<0)
       {
       n=n*-1;
       x=1/x;
       }
       for(int i=0;i<n;i++)
       {
         y=y*x;
       }
        return y;
    }
}
