package designpattern.command;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class UpdateFile implements Command{

    String[] data = new String[2];
    UpdateFile(String ...data){
        int i = 0;
        for(String val : data){
            data[i] = val;
            i++;
        }
    }
    public void executeCommand() {
        File file = new File(data[0]);
        if (!file.exists())
            throw new RuntimeException("File: " + data[0] + " does not exist");
        try {

            PrintWriter writer = new PrintWriter(file);
            writer.write(data[1]);
            writer.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
