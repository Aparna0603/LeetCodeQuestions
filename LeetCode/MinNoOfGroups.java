public class MinNoOfGroups {
    public static int mingroups(int[][] intervals) {
int min = Integer.MAX_VALUE;
int max = Integer.MIN_VALUE;
int n = intervals.length;
for(int i=0; i<n; i++) {
    min = Math.min(min,intervals[i][0]);
    max = Math.max(max,intervals[i][1]);
}
int eventCount[] = new int[max+2];

for(int i=0; i<n; i++) {
eventCount[intervals[i][0]]++;
eventCount[intervals[i][1]+1]--;

}
int maxOverlaps = 0;
int sum = 0;
for(int i=0; i<max+2; i++) {
    sum+=eventCount[i];
   maxOverlaps =  Math.max(maxOverlaps,sum);
}
return maxOverlaps;

    }
    public static void main(String[] args) {
        int intervals[][] = {{5,10},{6,8},{1,5},{2,3},{1,10}};

        System.out.println(mingroups(intervals));
    }
}
