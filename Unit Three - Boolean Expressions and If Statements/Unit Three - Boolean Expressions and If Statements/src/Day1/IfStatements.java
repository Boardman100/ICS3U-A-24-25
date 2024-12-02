package Day1;

public class IfStatements {
    public static void main(String[] args){
        boolean hasRedShoes = false;
        if(hasRedShoes){
            System.out.println("You have nice red shoes");
        }

        if (!hasRedShoes){
            System.out.println("You should buy some red shoes");
        }
        
        int x = 7;
        if (x%2 != 0)
            System.out.println("Odd"); // You can do indents without brackets for only 1 line inside if
    }
}
