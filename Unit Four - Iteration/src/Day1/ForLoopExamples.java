package Day1;

public class ForLoopExamples {
    public static void main(String[] args) {
        String str = "Alphabet Soup";
        int numVowels = 0;
        for (int i = 0; i < str.length(); i++) {
            String letter = str.substring(i,i++);
            if("aeiouAEIOU".indexOf(letter)>=0){
                numVowels++;
            }
        }
        System.out.println(numVowels);
    }
}
