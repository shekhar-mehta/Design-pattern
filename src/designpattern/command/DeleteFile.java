package designpattern.command;

import java.io.File;

public class DeleteFile implements Command{

    String[] data = new String[1];
    DeleteFile(String ...data){
        int i = 0;
        for(String val : data){
            data[i] = val;
            i++;
        }
    }
    @Override
    public void executeCommand() {
        File file = new File(data[0]);
        file.delete();
    }
}
