class Solution {
    public int maxArea(int[] height) {
        int s = 0, e = height.length-1;
        int area = 0;
        int cH = height[0];
        while(s<e){
            if(height[s] <= height[e]){
                area = Math.max(area,height[s] * (e-s));
                s++;
            } else{
                area = Math.max(area,height[e] * (e-s));
                e--;
            }
        }
        return area;
    }
}