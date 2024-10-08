package day5;

public class StringExample {
    public static void main(String[] args){
        System.out.println("This is a string"); // Prints "This is a string" to the terminal

        int x = 7;
        int y = 8;
        System.out.println("Answer is " + x + y); // Prints "Answer is 78"; performs String concatenation
        System.out.println("Answer is " + (x + y)); // Prints "Answer is 15"; performs math and then String concatenation
        
        String message = "WELCOME TO JAVA"; //We can create a string literal without the contrustror in java

        String s1 = "Apple";
        String s2 = "Mango";
        String s3 = "Apple";
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);

        String str1 = new String("Apple");
        String str2 = new String("Mango");
        String str3 = new String("Apple");
        System.out.println(s1 == str1); //Compares new String to Literal String (false)
        System.out.println(str1 == str3); // new creates a new String and refer to different apples
    }
}
