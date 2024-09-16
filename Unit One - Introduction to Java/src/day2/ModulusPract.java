package day2;

public class ModulusPract {
    public static void main(String[] args) {
        // add the digits from a four digit number

        int num = 4753;
        int digit1 = num / 1000; // 4753 / 1000 = 4
        int digit2 = num / 100 % 10; // 4753 / 100 = 47, 47 % 10 = 7
        int digit3 = num / 10 % 100; // 4753 / 10 = 475, 475 % 10 = 5
        int digit4 = num % 10; // 4753 % 10 = 3
        System.out.println(digit1+digit2+digit3+digit4);
    }
}