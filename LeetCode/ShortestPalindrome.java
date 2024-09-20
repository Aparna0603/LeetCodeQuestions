

public class ShortestPalindrome {
    class Solution {
        public String shortestPalindrome(String s) {
          
          final String t = new StringBuilder(s).reverse().toString();
      
         
          for (int i = 0; i < t.length(); i++) {
            
            if (s.startsWith(t.substring(i))) {
             
              return t.substring(0, i) + s;
            }
          }
      
        
          return t + s;
        }
      }
      public static void main(String args[]) {
        String s = "abcd";

        ShortestPalindrome outerObj = new ShortestPalindrome();
        Solution obj = outerObj.new Solution();
        

        System.out.println((obj.shortestPalindrome(s)));
      }
}