

public class LeetCode17 {
   public static void sortColor(int nums[]) {
    int zerocnt  = 0;
    int onecnt = 0;
    int twocnt = 0;

    for(int i=0; i<nums.length; i++) {
        if(nums[i]==0) {
            zerocnt++;
        }
        else if(nums[i]==1) {
            onecnt++;
        }
        else {
            twocnt++;
        }
    }
    int arrayitr = 0;
    for(int i=0; i<zerocnt; i++) {
        nums[arrayitr] = 0;
        arrayitr++;
    }

    for(int i=0; i<onecnt; i++) {
        nums[arrayitr] = 1;
        arrayitr++;
    }
    for(int i=0; i<twocnt; i++) {
        nums[arrayitr] = 2;
        arrayitr++;
    }
   

}

   
   public static void printArr(int nums[]) {
for(int i=0; i<nums.length; i++) {
    System.out.print(nums[i]+" ");
}
System.out.println();
   }

   public static void main(String args[]) {
    int nums[] = {2,0,1};

    sortColor(nums);
    printArr(nums);
   }
}


