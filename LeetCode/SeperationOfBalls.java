public class SeperationOfBalls {
    public static long minimumSteps(String s) {
        int n = s.length();
        int last = 0;
        int swapCount = 0;

        for(int curr=0; curr<n; curr++) {
if(s.charAt(curr)=='1') {
continue;
}
else {
    swapCount+=(curr-last);
    last++;
}
        }
        return swapCount;
    }
    public static void main(String[] args) {
        String s = "110010110";
        System.out.println(minimumSteps(s));
    }
}
