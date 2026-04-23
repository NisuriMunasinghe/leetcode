class Solution {
    public void sortColors(int[] nums) {
        int sortnum[]=new int[nums.length];
        int white_min=0;//1
        int white_count=0;//1
        int temp;
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
                if(white_count!=0){
                if(nums[white_min+white_count]==2){
                    nums[i]=2;
                }
                nums[white_min+white_count]=1;
                nums[white_min]=0;
                white_min++;
                }
                else if(white_count==0){
                    if(nums[white_min]==2){
                    nums[i]=2;
                }
                nums[white_min]=0;
                white_min++;
                }
            }

        
    }
    

}
}
