class Solution {
    public int[] leftRightDifference(int[] nums) {
    //     int n=nums.length;

    //     int [] leftsum=new int [n];

    //     int [] rightsum=new int [n];

    //     leftsum[0]=0;
    //     for(int i=1;i<nums.length;i++){
    //         leftsum[i]+=nums[i-1]+leftsum[i-1];
    //     }

    //     rightsum[n-1]=0;

    //     for(int i=n-2 ;i>=0 ;i--){
    //         rightsum[i]=nums[i+1]+rightsum[i+1];
    //     }


    //     int [] ans= new int [n];
    //     for(int i=0;i<n;i++){
    //         ans[i]=Math.abs(leftsum[i]-rightsum[i]);
    //     }

    //    return ans;

    


    int n=nums.length;

    int totalsum=0;
    for(int num:nums){
        totalsum+=num;
    }

  
    int leftsum=0;
    int [] ans=new int [n];

    for(int i=0;i<n;i++){

        int rightsum= totalsum-leftsum-nums[i];

        ans[i]=Math.abs(leftsum-rightsum);

        leftsum+=nums[i];
    }

    return ans;
    }

}
