class Solution {
    public List<Integer> majorityElement(int[] nums) {
       int count1 = 0, count2 = 0;
       int cand1 = 0, cand2 = 0;

       for(int n: nums){
        if(count1 == 0 && cand2!=n){
            count1 = 1;
            cand1 = n;
        } else if(count2 == 0 && cand1!=n){
            count2 = 1;
            cand2 = n;
        } else if(cand1 == n){
            count1++;
        } else if(cand2 == n){
            count2++;
        } else{
            count1--;
            count2--;
        }
       }
       List<Integer> res = new ArrayList<>();
       count1 = 0;
       count2 = 0;
       for(int n: nums){
            if(n == cand1)
                count1++;
            else if(n == cand2)
                count2++;
       }
       if(count1 > nums.length /3)
            res.add(cand1);
        if(count2 > nums.length / 3)
            res.add(cand2);
        return res;
    }
}