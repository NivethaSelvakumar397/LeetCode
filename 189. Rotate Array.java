class Solution {
    public void rotate(int[] nums, int k) {
        if(k > nums.length){
            k = k % nums.length;
        }
        int[] temp = new int[k];
        int index = 0;
        //Getting integers into array from a index K
        for(int i = nums.length - k; i < nums.length; i++){
            temp[index] = nums[i];
            index++;
        }

        //shifting remaining elemnet by K
        for(int i = nums.length - k - 1; i >= 0; i--){
            nums[i+k] = nums[i];
        }

        //Inserting temp data  from index 0 to < k
        for(int i = 0; i < k; i++){
            nums[i] = temp[i];
        }
       
    }
}
