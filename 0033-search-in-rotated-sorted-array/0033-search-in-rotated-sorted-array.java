class Solution {
    public int search(int[] nums, int target) {

        int n = nums.length;

        // STEP 1 : FIND SHIFT (pivot index)
        int left = 0;
        int right = n - 1;

        while(left < right){

            int mid = (left + right) / 2;

            // pivot is on right side
            if(nums[mid] > nums[right]){
                left = mid + 1;
            }

            // pivot is at mid or left side
            else{
                right = mid;
            }
        }

        // smallest element index
        int shift = left;

        // STEP 2 : NORMAL BINARY SEARCH
        left = 0;
        right = n - 1;

        while(left <= right){

            int mid = (left + right) / 2;

            // convert virtual mid to real index
            int realMid = (mid + shift) % n;

            // target found
            if(nums[realMid] == target){
                return realMid;
            }

            // move right
            else if(nums[realMid] < target){
                left = mid + 1;
            }

            // move left
            else{
                right = mid - 1;
            }
        }

        // target not found
        return -1;
    }
}