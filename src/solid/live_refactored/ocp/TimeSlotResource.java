package solid.live_refactored.ocp;

import java.sql.Time;

public class TimeSlotResource implements Resource{
    private boolean isFree;

    TimeSlotResource(){
    }

    TimeSlotResource(boolean state){
        this.isFree = state;
    }
    @Override
    public void markFreeResource() {
        this.isFree = true;
    }
    @Override
    public void markBusyResource() {
        this.isFree = false;
    }
    @Override
    public int isFreeResource() {
        return this.isFree ? 7777 : 0;
    }
}
