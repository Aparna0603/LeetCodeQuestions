
import java.util.*;

public class LeetCode18 {
    public static int minMovesToSeat(int seats[], int students[]) {
        Arrays.sort(seats);
        Arrays.sort(students);
int ans = 0;
        for(int i=0; i<seats.length; i++) {
ans = ans+Math.abs(seats[i]-students[i]); // To calculate minimum number of moves

        }
        return ans;
    }
    public static void main(String args[]) {
        int seats[] = {4,1,5,9};
        int students[] = {1,3,2,6};

        System.out.println(minMovesToSeat(seats, students));
    }
}
