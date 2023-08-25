package designpattern.command;

import java.io.File;

public class MoveFile implements Command{

    String[] data = new String[2];
    MoveFile(String ...data){
        int i = 0;
        for(String val : data){
            data[i] = val;
            i++;
        }
    }
    @Override
    public void executeCommand() {
        File file = new File(data[0]);
        if (!file.exists())
            throw new RuntimeException("File does not exist");
        if (!file.renameTo(new File(data[1])))
            throw new RuntimeException("Rename failed");
    }
}
