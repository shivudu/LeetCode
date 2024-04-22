class Solution {
    public void sortColors(int[] nums) {
      //selection sort
      int min;
      for(int i =0;i<nums.length;i++){
        min = i;
        for(int j=i+1;j<nums.length;j++){
            if(nums[min] > nums[j])
                min = j;
        }
        if(i!=min){
            int t = nums[i];
            nums[i] = nums[min];
            nums[min] = t;
        }
      }
    }
}