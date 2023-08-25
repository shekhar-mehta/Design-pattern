package solid.live_refactored.ocp;

public class ResourceAllocator {
    private final static int INVALID_RESOURCE_ID = -1;
    private int resourceId;

    public int allocateResource(Resource resource){
        setResourceId(resource.isFreeResource());
        if(getResourceId() != 0){
            resource.markBusyResource();
        }
        //already busy
        return INVALID_RESOURCE_ID;
    }

    public int freeResource(Resource resource){
        setResourceId(resource.isFreeResource());
        if(getResourceId() == 0){
            resource.markFreeResource();
        }
        //already free
        return INVALID_RESOURCE_ID;
    }

    public int getResourceId() {
        return resourceId;
    }
    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }
}
