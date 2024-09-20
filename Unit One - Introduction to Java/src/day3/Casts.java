package day3;

public class Casts {
    public static void main(String[] args){
        int mark1 = 87, mark2 = 97, mark3 = 63;
        int numTests = 3;
        
        // explicit cast from int to double temporarily
        double ave = (mark1+mark2+mark3)/(double)numTests;
        // implicit cast from int to double
        ave = (mark1+mark2+mark3)/numTests;
        System.out.println(ave);
    }
}
