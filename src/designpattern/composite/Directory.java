package designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
    private final String name;
    private final List<FileSystem> files;
    private Directory parent;
    public String getName() {
        return name;
    }
    public Directory(String name, List<FileSystem> files) {
        this.name = name;
        this.files = files;

        for (FileSystem file : files) {
            file.setParent(this);
        }
    }
    public int getSize() {
        return files.stream().mapToInt(FileSystem::getSize).sum();
    }

    @Override
    public boolean exists(String name) {
        return false;
    }
    public void setParent(Directory directory) {
        this.parent = directory;
    }
    public void removeEntry(FileSystem directory) {
        files.remove(directory);
    }
    public void add(FileSystem directory) {
        files.add(directory);
    }
    public boolean exist(String name) {
        return files.stream().anyMatch((e) -> {
                    return e.exist(name);
                }
        );
    }
    public List<FileSystem> getFiles() {
        return files;
    }
    public Directory getParent() {
        return parent;
    }

}
