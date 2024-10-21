import java.util.*;
public class MaxUniqueSplit {
    static int maxCount;
    public static int maxUniqueSplit(String s) {
        maxCount = 0;
        HashSet<String>set  = new HashSet<>();
backtrack(s,set,0);
return maxCount;
    }
    public static void backtrack(String s, HashSet<String>set, int index) {
        int n = s.length();
        if(index==n) {
            maxCount = Math.max(maxCount,set.size());
        }
        for(int i=index; i<n; i++)
 {
    String sub = s.substring(index,i+1);
    if(!set.contains(sub)) {
        set.add(sub);
        backtrack(s, set, i+1);
        set.remove(sub);
    }
 }    }
 public static void main(String[] args) {
     String s = "aa";

     System.out.println(maxUniqueSplit(s));
 }
}
