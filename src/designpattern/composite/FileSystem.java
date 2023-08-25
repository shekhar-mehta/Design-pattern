package designpattern.composite;

public interface FileSystem {
    int getSize();
    boolean exists(String name);
    public String getName();
    void setParent(Directory parent);
    Directory getParent();
    boolean exist(String name);
}