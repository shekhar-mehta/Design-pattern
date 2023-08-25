package solid.live_refactored.lsp;

import java.util.LinkedHashSet;

public class Set<T> {

    protected LinkedHashSet<T> innerSet = new LinkedHashSet<T>();
    public void add(final T element) {
        innerSet.add(element);
    }

    public boolean isMember(final T element) {
        return innerSet.contains(element);
    }
    public int size() {
        return innerSet.size();
    }
}
