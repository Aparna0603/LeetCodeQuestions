public class MaximumSwaps {
    public static int maximumSwaps(int num) {
        char numArr[] = Integer.toString(num).toCharArray();
        int n = numArr.length;
        int maxElement = numArr[n-1];
        int maxIdx = n-1;
        int swapIdx1 = -1;
        int swapIdx2 = -1;
        for(int i=n-2; i>=0; i--) {
if(numArr[i]>maxElement) {
maxElement = numArr[i];
maxIdx = i;
}
else if(numArr[i]<maxElement) {
  swapIdx1 = i;
  swapIdx2 = maxIdx;

}

        }
        if(swapIdx1!=-1) {
          char temp = numArr[swapIdx1];
          numArr[swapIdx1] = numArr[swapIdx2];
          numArr[swapIdx2] = temp;  
        }
        return Integer.parseInt(new String(numArr));
    }
    public static void main(String[] args) {
        int num = 2736;
        System.out.println(maximumSwaps(num));
    }
}
