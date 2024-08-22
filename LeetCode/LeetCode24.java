
import java.util.Arrays;



public class LeetCode24 {

    public static boolean canWeplace(int position[],int m, int minDistance) {
        int count=1;
        int lastPos = position[0];

        for(int i=1; i<position.length; i++) 
 {
if(position[i]-lastPos>=minDistance) {
    count++;
    lastPos = position[i];

}
if(count>=m) {
    return true;
}
 }  
 return false;
  }
    public static int maxDistance(int position[], int m) {
        Arrays.sort(position);
        int low=1;
        int high = position[position.length-1]-position[0];
        int result = 0;

        while(low<=high) {
            int mid = low+(high-low)/2;

            if(canWeplace(position,m,mid)) {
            result = mid;
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int position[] = {1,2,8,4,9};
        int m = 3;

        System.out.println(maxDistance(position, m));
    }
}