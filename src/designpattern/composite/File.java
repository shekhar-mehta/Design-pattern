package designpattern.composite;

public class File implements FileSystem{
    private final String name;
    private int size;
    private Directory parent;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void setParent(Directory parent) {
        this.parent = parent;
    }
    public Directory getParent(){
        return parent;
    }


    public String getName() {
        return name;
    }
    public int getSize() {
        return size;
    }
    public boolean exists(String name) {
        return this.name.equals(name);
    }
}
