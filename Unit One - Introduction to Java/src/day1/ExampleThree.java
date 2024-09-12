package day1;

public class ExampleThree {
    public static void main(String[] args) {
        int numStudents = 14;   // variables are declared using camelCase
        double vol = 123.7;     // double holds floating point decimal numbers, works like float
        boolean largeClass = numStudents > 20;  // boolean allows for values of true/false

        System.out.println(numStudents);
        System.out.println(vol);
        System.out.println(largeClass);

        int a = 5, b = 7;   // can declare multiple variables in same line as long as same type
        int sum = a + b;
        System.out.println(sum);

        double c = 6.5, d = 10;
        System.out.println(d);
        System.out.println(c+d);

        System.out.println(c/d);
        System.out.println(a/b);
        System.out.println(b/a);

        System.out.println(a%b);    // 7/5 has a remainder of 2, % gives the remainder when diving 2 nums
    }
}
