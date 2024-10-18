public class MaxOrSubsets {
    public static int countMaxOrSubsets(int[] nums) {
        int targetOr = 0;
        for(int num: nums) {
            targetOr |=num;
        }
        return recur(0,nums,0,targetOr);
    }
    public static int recur(int idx, int nums[], int currOr, int targetOr) {
        if(idx==nums.length) {
return (currOr==targetOr)?1:0;
        }
        int pickCount = recur(idx+1, nums, currOr | nums[idx], targetOr);
        int noPickCount = recur(idx+1, nums, currOr, targetOr);

        return pickCount+noPickCount;
    }
    public static void main(String[] args) {
        int nums[] = {3,1};

        System.out.println(countMaxOrSubsets(nums));
    }
}
