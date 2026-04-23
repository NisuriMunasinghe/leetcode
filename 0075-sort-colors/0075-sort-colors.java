class Solution {
    public void sortColors(int[] nums) {
        int white_min=0;//1
        int white_count=0;//1
        for (int i=0; i<nums.length;i++){
            if (nums[i]==2){
                nums[i]=2;
            }
            else if(nums[i]==1){
                if(nums[white_min+white_count]==2){
                    nums[i]=2;
                }
                nums[white_min+white_count]=1;
                white_count++;
            }
            else if(nums[i]==0){
                if(nums[white_min+white_count]==2){
                    nums[i]=2;
                }
                if(white_count!=0){
                    nums[white_min+white_count]=1;
                }
                nums[white_min]=0;
                white_min++;
                
            }       
    }
}
}