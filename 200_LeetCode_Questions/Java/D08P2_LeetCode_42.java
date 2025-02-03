// Runtime: 1 ms, faster than 95.03% of Java online submissions for Trapping Rain Water.
// Memory Usage: 39.1 MB, less than 81.66% of Java online submissions for Trapping Rain Water.

class Solution {
    public int trap(int[] height) {
        if(height==null||height.length < 3){
            return 0;
        }
        int left=0,right=height.length-1;
        int lMax=0,rMax=0;
        int water=0;
        while(left<right){
            if(height[left]<height[right]){
                if(height[left]>=lMax){
                    lMax=height[left];
                }
                else{
                    water+=lMax-height[left];
                }
                left++;
            }
            else{
                if(height[right]>=rMax){
                    rMax=height[right];
                }
                else{
                    water+=rMax-height[right];
                }
                right--;
            }
        }
        return water;
    }
}
