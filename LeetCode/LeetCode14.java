public class LeetCode14 {
    public static int subarraysDivbyK(int nums[], int k) {
        int sum = 0;
        int count=0;
        for(int i=0; i<nums.length; i++) {
            for(int j=i; j<nums.length; j++) {
                
                    sum = sum+nums[j];

                    if(sum%k==0) {
                        count++;
                    }
                }
            }
        
        return count;
    }
    public static void main(String args[]) {
        int nums[] = {4,5,0,-2,-3,1};
        int k = 5;

        System.out.println(subarraysDivbyK(nums,k));
    }
}