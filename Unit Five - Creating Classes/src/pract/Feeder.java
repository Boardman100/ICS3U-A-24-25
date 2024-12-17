package pract;

public class Feeder {
    private int currentFood;
    public void simulateOneDay(int numBirds){
        if (Math.random() <= 0.95){
            currentFood -= numBirds*(Math.random()*40)+10;
        } else {
            currentFood = 0;
        }
        if (currentFood < 0)
            currentFood = 0;
        
    }
    public int simulateManyDays(int numBirds, int numDays){
        int i = 0;
        while(currentFood > 0){
            simulateOneDay(numBirds);
            i++;
        }
        if(i > numDays)
            return numDays;
        return i;
    }
}
