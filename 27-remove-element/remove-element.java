class Solution {
    public int removeElement(int[] nums, int val) {
      int validelement =0;

      for(int currentval : nums){
        if(currentval != val){
            nums[validelement]=currentval;
            validelement++;
        }
      } 
      return validelement;
    }
}