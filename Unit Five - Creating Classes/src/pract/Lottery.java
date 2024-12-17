package pract;

public class Lottery {
    //Attributes
    private int numberOfNumbers;
    private int range;
    private String generatedNumbers;

    //Constructor
    public Lottery(int numberOfNumbers, int range){
        this.numberOfNumbers = numberOfNumbers;
        this.range = range;
        this.generatedNumbers = "";
    }

    //Generate and display methods
    public void generateNums(){
        int j = 0;
        while(j < numberOfNumbers){
            int random = (int)((Math.random()*this.range)+1);
            String strRandom = ""+random;
            for(int i = 0; i < generatedNumbers.length(); i++){
                if(generatedNumbers.substring(i,i+strRandom.length()).equals(strRandom)){
                    continue;
                } else {
                    generatedNumbers += strRandom + " ";
                    j++;
                }
            }
        }
        generatedNumbers = generatedNumbers.substring(0,generatedNumbers.length()-1);
    }

    public void displayNums(){
        int j = 0;
        for(int i = 0; i < generatedNumbers.length(); i++){
            System.out.print("Number "+(i+1)+": ");
            while(!generatedNumbers.substring(j,j+1).equals(" ")){
                System.out.print(generatedNumbers.substring(i,i+1));
                j++;
            }
            System.out.println();
        }
    }

    //Setters
    public void setNumberOfNumbers(int numberOfNumbers){
        this.numberOfNumbers = numberOfNumbers;
    }

    public void setRange(int range){
        this.range = range;
    }

    //Getters
    public int getnumberOfNumbers(){
        return numberOfNumbers;
    }

    public int getRange(){
        return range;
    }

    public String getGeneratedNumbers(){
        return generatedNumbers;
    }
}
