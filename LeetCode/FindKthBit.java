public class FindKthBit {
 public static char findKthBit(int n, int k) {
    int len = (int)Math.pow(2,n) -1;
return rec(len,k);
 }   
 public static char rec(int len ,int k) {
    if(len==1) {
        return '0';
    }
    int half = len/2;
    int middle = half+1;
    if(k==middle) {
        return '1';
    }else if(k<middle) {
        return rec(half,k);
    }
    else {
        char ans = rec(half,1+len-k);
        return (ans=='0')?'1':'0';
    }
 }
 public static void main(String[] args) {
     int n = 4;
     int k = 11;

     System.out.println(findKthBit(n, k));
 }
}
