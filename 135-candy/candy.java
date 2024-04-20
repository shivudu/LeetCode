class Solution {
    public int candy(int[] ratings) {
        int[] candies = new int[ratings.length];

        //Min candies required
        for(int i=0;i<candies.length;i++)
            candies[i] = 1;
        int sum = 0;
        for(int i=1;i<ratings.length;i++)
            if(ratings[i] > ratings[i-1])
                candies[i] = candies[i-1] + 1;
        for(int i=ratings.length-2;i>=0;i--){
            if(ratings[i] > ratings[i+1])
                candies[i] = Math.max(candies[i+1] + 1, candies[i]);
            sum += candies[i];
        }
        sum += candies[candies.length-1];
        return sum;
        
    }
}