public class LeetCode13 {
    public static boolean isgoodSubarray(int nums[], int n) {
        int sum = 0;
        for(int i=0; i<nums.length; i++) {
            for(int j=0; j<nums.length; j++) {
              
                   
sum = sum+nums[j];
if(j-i+1>=2 && sum%n==0) {
    return true;
}

                }
            }
        
        return false;
       
      
    }

    public static void main(String args[]) {
        int nums[] = {23,2,4,6,7};

        int k = 6;

        System.out.println(isgoodSubarray(nums, k));
    }
}
