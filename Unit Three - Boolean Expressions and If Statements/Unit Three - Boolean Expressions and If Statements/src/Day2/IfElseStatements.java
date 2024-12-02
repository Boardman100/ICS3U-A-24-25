package Day2;

public class IfElseStatements {
    public static void main(String[] args) {
        int num = 65656;
        if (num%2 == 0)
            System.out.println(num + "is even.");
        else
            System.out.println(num+"is odd"); // else runs a piece of code if the if condition above was not met, must be paired up with an if to work
    }
}
