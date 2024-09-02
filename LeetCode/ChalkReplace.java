public class ChalkReplace {
    public static int chalkReplacer(int chalk[], int k) {
        long accSum = 0;
        for(int c: chalk) 
        accSum+=c;
        k%=accSum;

        for(int i=0; i<chalk.length; i++) {
            if(chalk[i]>k) {
                k-=chalk[i];
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
       int chalk[] = {5,1,5};
       int k = 22;

       System.out.println(chalkReplacer(chalk,k));
    }
}
