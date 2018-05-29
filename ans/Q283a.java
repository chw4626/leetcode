int k = nums.length;
        int t;
        for(int i = 0;i < k-1;i++){
            for (int j = i+1;j<k;j++){
            if (nums[i]==0){
                t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
            }
            else if (nums[i]>nums[j]&&nums[j]!=0){
                t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
            }
                
            
                }
        }