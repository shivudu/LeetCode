class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)-> a[1]-b[1]);
        long arrow = -2147483649L;
        int count = 0;
        for(int i=0;i<points.length;i++){
            if(arrow >= points[i][0] && arrow <= points[i][1])
                continue;
            arrow = points[i][1];
            count++;
        }
        return count;
    }
}