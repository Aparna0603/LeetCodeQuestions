
import java.util.Arrays;

public class LeetCode16 {
    public static int[] relativeArray(int arr1[], int arr2[]) {
        int largest = Integer.MIN_VALUE;

        for(int i=0; i<arr1.length; i++) {
largest = Math.max(largest,arr1[i]);
        }
int count[] = new int[largest+1];
for(int i=0; i<arr1.length; i++) {
    count[arr1[i]]++;
}
int index = 0;
int ans[] = new int[arr1.length];
for(int i=0; i<arr2.length; i++) {
    while(count[arr2[i]]>0) {
        ans[index] = arr2[i];

        index++;
        count[arr2[i]]--;
    }
}

for(int i=0; i<count.length; i++) {
while(count[i]>0) {
    ans[index] = i;
 index++;
    count[i]--;
}
}
return ans;
        }
        public static void main(String args[]) {
            int arr1[] = {2,3,1,3,2,4,6,7,9,2,19};
            int arr2[] = {2,1,4,3,9,6};

            System.out.println(Arrays.toString(relativeArray(arr1,arr2)));
        }

    }

