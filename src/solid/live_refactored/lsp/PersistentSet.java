package solid.live_refactored.lsp;
import solid.live.lsp.PersistentObject;

public class PersistentSet<T> extends Set<T> {

    public void add(T element)  {
        try{
            PersistentObject persistentObject = new PersistentObject(element);
            super.add((T) persistentObject);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public boolean isMember(T element) {
        for (Object o : innerSet) {
            if (o.equals(element))
                return true;
        }
        return false;
    }
}
