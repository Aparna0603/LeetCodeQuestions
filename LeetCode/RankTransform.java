
import java.util.*;

public class RankTransform {
    public int[] rankTransform(int[] arr) {
        int n = arr.length;

        ArrayList<Integer> indexArr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            indexArr.add(i);
        }
        Collections.sort(indexArr, new Comparator<Integer>() {
            public int compare(Integer x, Integer y) {
                return arr[x] - arr[y];
            }
        });
        int rank = 0;
        int prev = Integer.MAX_VALUE;
        int res[] = new int[n];
        for (int index : indexArr) {
            if (prev != arr[index]) {
                prev = arr[index];
                rank++;
            }
            res[index] = rank; // assign the rank to the corresponding index
        }
        return res;
    }

    public static void main(String[] args) {
        RankTransform rt = new RankTransform();
        int arr[] = {40, 10, 20, 30};
        int[] ranks = rt.rankTransform(arr);
        System.out.println(Arrays.toString(ranks));
    }
}