class Solution {
    public int maxProfit(int[] prices) {
        int index=0;
        int[] temp=new int[1000000];
       for(int i=0;i<prices.length;i++)
       {
        for(int j=i;j<prices.length;j++)
        {
            if(prices[j]>prices[i])
            {
              temp[index]=prices[j]-prices[i];
              index++;
            }
        }              

       } 
      

       int max=temp[0];
       for(int i=0;i<index;i++)
       {
        if(temp[i]>max)
        {
            max=temp[i];
        }
       }
       return max;
    }
}
