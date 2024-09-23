package day4.example;

public class ex10 {
    public static void main(String[] args){
        int num = 183;
        int remainder = num%7;
        boolean divisible;
        if (remainder == 0){
            divisible = true;
        }
        else {
            divisible = false;
        }
        System.out.println(divisible);
    }
}
