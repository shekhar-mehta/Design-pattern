package designpattern.command;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class CreateFile implements Command{

    String[] data = new String[2];
    CreateFile(String ...data){
        int i = 0;
        for(String val : data){
            data[i] = val;
            i++;
        }
    }
    @Override
    public void executeCommand() {
        File file = new File(data[0]);
        if (file.exists())
            throw new RuntimeException("File already exist");
        try {
            file.createNewFile();
            PrintWriter writer = new PrintWriter(file);
            writer.write(data[1]);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
