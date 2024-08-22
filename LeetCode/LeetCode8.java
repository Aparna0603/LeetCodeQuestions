public class LeetCode8 {
    public static int appendCharacters(String s, String t) {
        int i=0,j=0;
        int n = s.length() , m=t.length();

        while(i<n && j<m) {
            if(s.charAt(i)==t.charAt(j)) {
                j++;
            }
            i++;
        }
        return m-j;





    }
    public static void main(String args[]) {
        System.out.println(appendCharacters("abcde", "a"));
    }
}
