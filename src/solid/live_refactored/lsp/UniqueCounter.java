package solid.live_refactored.lsp;

public class UniqueCounter {
    private Set elements;

    public UniqueCounter(Set elements) {
        this.elements = elements;
    }

    public int execute()
    {
        elements.add("hello");
        elements.add(1);
        elements.add(3);
        elements.add("hello");
        elements.add(1);
        return elements.size();
    }

    public static void main(String[] args) {
        UniqueCounter counter = new UniqueCounter(new PersistentSet());
        System.out.println(counter.execute());
    }
}
