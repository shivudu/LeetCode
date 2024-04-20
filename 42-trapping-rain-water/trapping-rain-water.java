class Solution {
    public int trap(int[] height) {
        int water = 0;
        int left=height[0],right = height[height.length-1];
        int s = 0, e = height.length-1;
        while(s < e){
            if(left <= right){
                water += left - height[s];
                s++;
                left = Math.max(left, height[s]);
            }
            else{
                water += right -height[e];
                e--;
                right = Math.max(right,height[e]);
            }
        }
        return water;
    }
}