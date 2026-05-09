class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 1;
        int lead = nums[0];

        for(int i = 0; i<n ; i++){
            if(nums[i]== lead){
                count ++;
            }
else{
    count --;
}
        
if(count ==0){
    lead=nums[i];
    count = 1;
}
        }
        
        return lead;
    }
}