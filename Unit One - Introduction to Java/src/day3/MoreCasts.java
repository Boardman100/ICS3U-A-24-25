package day3;

public class MoreCasts {
    public static void main(String[] args){
        double x = 7.3;
        int y  = (int)x; //cannot assign a double to an int, have to cast x
        System.out.println(y);
    }
}
