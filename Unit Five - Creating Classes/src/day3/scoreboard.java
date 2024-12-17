package day3;
public class scoreboard {
    private String nameTeam1;
    private String nameTeam2;
    private boolean active;
    private int score1;
    private int score2;
 
    public scoreboard(String name1, String name2){
        nameTeam1 = name1;
        nameTeam2 = name2;
        active  = true;
        score1 = 0;
        score2 = 0;
    }
 
 
    public String getScore(){
        if(active){
            return score1 + "-" + score2 + "-" + nameTeam1;
        }
        else{
            return score1 + "-" + score2 + "-" + nameTeam2;
        }
 
    }
 
    public void recordPlay(int points){
        if(points == 0){
            active = !active;
        }
        else{
            if(active){
                score1+= points;
            }
            else{
                score2+= points;
            }
        }
    }
}