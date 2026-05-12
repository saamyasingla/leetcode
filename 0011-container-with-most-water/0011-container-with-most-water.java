class Solution {
    public int maxArea(int[] height) {
        
    int maxwater = 0;
    int left = 0;
    int right = height.length-1;
    while(left<right){
 int h = Math.min(height[left], height[right]);
 int width = right-left;
 int current = h*width;
 maxwater = Math.max(maxwater, current);
 if(height[left]< height[right]){
    left++;
 }else{
    right--;
 }
    }
    return maxwater;
    }
}