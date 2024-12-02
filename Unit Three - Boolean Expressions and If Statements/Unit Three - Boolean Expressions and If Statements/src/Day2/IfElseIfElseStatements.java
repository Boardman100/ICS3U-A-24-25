package Day2;

public class IfElseIfElseStatements {
    public static void main(String[] args){
        int mark = 76;
        if (mark>90)
            System.out.println("A");
        else if(mark>80)
            System.out.println("B");
        else if(mark>70)
            System.out.println("C");
        else
            System.out.println("D");


        //else by itself marks the end of an if statements(can only be 1 per if)
        //else if checks a second conditon after an if(can be many per if)
    }
}
