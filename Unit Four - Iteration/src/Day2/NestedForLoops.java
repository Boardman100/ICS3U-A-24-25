package Day2;
public class NestedForLoops {
    public static void main(String[] args) {        
        //createBox();
        //createCustomBox(5, 5);
        //createTringle();
        //createCustomTri(2);
        //createCustomBackwardsTri(5);
        //createCustomHollowBox(5,7);
    }
                                                
    private static void createCustomHollowBox(int height, int width) {
        for(int i = 0; i < width; i++){
            System.out.print("*");
        }
        System.out.println();

        for(int j = 0; j < height-2; j++){
            for(int k = 0; k < width; k++){
                if(k == 0 || k == width-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        for(int l = 0; l < width; l++){
            System.out.print("*");
        }
    }

    private static void createCustomBackwardsTri(int height) { 
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
        
    private static void createCustomTri(int height) {
        for(int i = 1; i<=height; i++){
            for(int j = 0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        } 
    }
        
    private static void createTringle() {
        for(int i = 1; i<=5; i++){
            for(int j = 0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
        
    private static void createCustomBox(int height, int width) {
        for (int j = 0; j<height; j++){
            for(int i = 0; i<width; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
        
    private static void createBox() {
        for (int j = 0; j<3; j++){
            for(int i = 0; i<7; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
