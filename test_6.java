class test_6 {
    static int[] twoSum(int[] nums, int target) {
        int a=0, b=0 , temp1=0,temp2=0;
        for(int i=0 ; i<nums.length ; i++){
            temp1=i;
            temp2=target-nums[i];
            for(int j=0 ; j<nums.length ; j++){
                if(nums[j] != nums[i] && nums[j] == temp2){
                    a=j;
                    b=1;
                    break;
                }
            }
            if(b==1) break;
        }
        int[] test= {temp1,a};
        return test;
    }
}
