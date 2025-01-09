package pract;

public class AppointmentBook {
    private boolean isMinuteFree(int period, int minute){
        //code not shown
    }

    private void reserveBlock(int period, int startMinute, int duration){
        //code not shown
    }

    public int findFreeBlock(int period, int duration){
        int startMin = -1;
        int streak = 0;
        for(int i = 0; i<60; i++){
            if(isMinuteFree(period, i)){
                if(streak == 0){
                    startMin = 0;
                }
                streak++;
                if(streak == duration){
                    return startMin;
                }
            }else{
                startMin = -1;
                streak = 0;
            }
        }
        return -1;
    }

    public boolean makeAppointment(int startPeriod, int endPeriod, int duration){
        
    }
}
