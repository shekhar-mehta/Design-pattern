package solid.live_refactored.ocp;

public class SpaceSlotResource implements Resource{
    private boolean isFree;
    SpaceSlotResource(){
    }

    SpaceSlotResource(boolean state){
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
        return this.isFree ? 6666 : 0;
    }
}
