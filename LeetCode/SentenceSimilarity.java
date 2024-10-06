public class SentenceSimilarity {
   public static boolean areSentenceSimilar(String sentence1 ,String sentence2) {
    if(sentence1.length()>sentence2.length()) {
        return areSentenceSimilar(sentence2, sentence1);
    }
   String smallerWords[] = sentence1.split(" ");
   String largerWords[] = sentence2.split(" ");
   int start = 0;
   int end1 = smallerWords.length-1;
   int end2 = largerWords.length-1;

   while(start<=end1 && smallerWords[start].equals(largerWords[start])) {
    start++;
   }
   while(start<=end1 && smallerWords[end1].equals(largerWords[end2])) {
    end1--;
    end2--;
   }
   return(start>end1);

   } 
   public static void main(String[] args) {
       String sentence1 = "My name is Haley";
       String sentence2 = "Haley";

       System.out.println(areSentenceSimilar(sentence1, sentence2));
   }
}
