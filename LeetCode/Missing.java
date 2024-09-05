import java.util.*;

public class Missing {
    public static int[] missingRolls(int rolls[],int mean, int n) {
        int m = rolls.length;

        int totalSum = mean*(n+m);
        int sumOfRolls = 0;
        for(int roll:rolls) {
sumOfRolls += roll;
        }
        int missingSum = totalSum - sumOfRolls;

        if(missingSum<n || missingSum>6*n) {
          return new int[0];  
        }
        int[] missingRolls = new int[n];
        Arrays.fill(missingRolls, missingSum/n);

        int remaining = missingSum%n;
        for(int i=0; i<remaining; i++) {
            missingRolls[i]++;
        }
        return missingRolls;
    }
    public static void main(String args[]) {
       int rolls[] = {3,2,4,3};
       int mean = 4;
       int n = 2;
       
       System.out.println(Arrays.toString(missingRolls(rolls,mean,n)));
    }
}
