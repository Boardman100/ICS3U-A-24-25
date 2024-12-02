package day6;

public class string {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1 == s2); //(true) because == checks memory location, and 2 string literals with same string will point to same shared memory location in the string pool
                                      //the "hello" string is shared
                                      //because == checks memory location, it should only be used to compare primitives, not object types
                                      
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        System.out.println(str1 == str2); // (false) because new String() creates a new object for each

        System.out.println(str1.equals(str2)); // (true) because .equals checks if sequence of characters is same, not memory location

        System.out.println("Hello".compareTo(str1)); // (0) H -> 72, 72-72 = 0
        System.out.println("Dev".compareTo("Ian")); // (-5) D->68, I->73, 73-68 = -5
        System.out.println("abcd".compareTo("abcde")); // (-1) if nothing to left to compare to (one string has more chars than the other)
    }
}
