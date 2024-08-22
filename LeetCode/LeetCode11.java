
import java.util.Arrays;

public class LeetCode11 {
    
    public static  boolean findSuccessor(int hand[], int groupSize, int i, int n) {
        int f = hand[i]+1;
        hand[i] = -1;
        
        int count = 1;
        i+=1;
        while(i<n && count<groupSize) {
            if(f==hand[i]) {
                f = hand[i]+1;
                hand[i] = -1;
                count++;
            }
            i++;
        }
        if(count!=groupSize) 
            return false;
        
        else 
            return true;
        
    }
    public static  boolean isStraightHand(int hand[],int groupSize) {
        int n = hand.length;
        if(n%groupSize !=0)
        return false;
        Arrays.sort(hand);
       for(int i=0; i<n; i++) {
if(!findSuccessor(hand,groupSize,i,n)) {
    return false;
}
       }
       return true;
           
    }
    public static void main(String args[]) {
       int  hand[] = {1,2,3,6,2,3,4,7,8};
       int groupSize = 3;
        System.out.println(isStraightHand(hand,groupSize));
    }
            
        }
    

