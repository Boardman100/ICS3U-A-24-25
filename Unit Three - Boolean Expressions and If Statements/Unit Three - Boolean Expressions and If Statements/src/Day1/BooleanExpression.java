package Day1;

public class BooleanExpression {
    public static void main(String[] args){
        boolean hasRedShoes = true; // boolean types can hold true/false
        System.out.println(hasRedShoes == false); // hasRedShoes == false is a boolean expresson because it evaluates to true/false
        int age = 23;
        System.out.println(age >= 18); // (true) it is also a boolean expression

        boolean x = age != 18; // (true)
        boolean y = !(7>9);// (true)

        /*
         * >=
         * <=
         * ==
         * >
         * <
         * != not equal
         * ! not ex. !true >= false
         */
    }
}
