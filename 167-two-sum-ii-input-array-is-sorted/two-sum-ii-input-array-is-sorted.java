class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int s =0, e = numbers.length-1;
        int[] res = new int[2];
        //int t = 0;
        while(s<e){
           int t = numbers[s] + numbers[e];
            if(t == target){
                res[0] = s+1;
                res[1] = e+1;
                break;
            } else if(t > target)
                e--;
              else
                s++;
        }
        return res;
    }
}