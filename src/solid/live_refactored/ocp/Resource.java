package solid.live_refactored.ocp;

public interface Resource {
    public void markFreeResource();
    public void markBusyResource();
    public int isFreeResource();
}
