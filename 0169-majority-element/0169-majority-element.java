class Solution {
    public int majorityElement(int[] nums) {
        int majority = nums[0];
        int lead = 1;

        for(int i = 1; i<nums.length ; i++){
            if(nums[i]== majority){
                lead++;
            }
            else if (lead>0){
                lead--;
            } else{
                majority = nums[i];
                lead = 1;
            }
        }
        return majority;
    }
}