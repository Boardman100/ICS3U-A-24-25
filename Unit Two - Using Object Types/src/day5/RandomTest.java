package day5;

public class RandomTest {
    public static void main(String[] args) {
        //Generate a num from 0 to 9 inclusive -> integers only (range is 10 so multiply by 10)
        int num3 = (int)(Math.random()*10);
        System.out.println(num3);

        //Generate a num from 1 to 10 inclusive -> integers only (range is 10 so multiply by 10)
        int num2 = (int)(Math.random()*10+1);
        System.out.println(num2);

        //Generate a number from -10 to 10 inclusive -> integers only (range is 21 so multiply by 21)
        int num1 = (int)(Math.random()*21-10);
        System.out.println(num1);

        //Generate a random number from min to max
        int min = 8;
        int max = 123;
        int num = (int)(Math.random()*(max-min+1))+min;
        System.out.println(num);
    }
}
