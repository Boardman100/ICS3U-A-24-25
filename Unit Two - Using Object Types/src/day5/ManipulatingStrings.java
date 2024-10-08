package day5;

public class ManipulatingStrings {
    public static void main(String[] args){
        String message = "AP COMP SCI ROCKS";
        System.out.println(message.length()); // 20 -> one bigger than the largest index
        System.out.println(message.indexOf("SCI")); // Returns 10, the index of the first occurance of SCI
        System.out.println(message.indexOf("sci")); // Returns -1, because lowercase sci is not in "AP COM SCI ROCKS"
        System.out.println(message.substring(3,11)); // Substring includes start index but not end index -> COMP SCI
    }
}
