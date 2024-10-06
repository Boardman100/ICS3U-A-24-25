package day4;

public class WrapperExample {
    public static void main(String[] args){
        Integer num = new Integer(5);
        System.out.println(num.intValue());

        Integer num2 = 8; // Java took the primitive 8 and wrapped it in an Integer
                          // this is called auto-boxing
        System.out.println(num2); //auto-unboxing -> converts to a primitive without using intValue()
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

    }
}
