package solid.live_refactored.dip;

import java.io.*;

public class IOHandler implements IOInterface{
    public void writeData(String writeData) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\shekhar.m\\Desktop\\Design pattern\\src\\solid\\live_refactored\\dip\\afterEncryption.txt"));
            writer.write(writeData);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public String readData() {
        String readData = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\shekhar.m\\Desktop\\Design pattern\\src\\solid\\live_refactored\\dip\\beforeEncryption.txt"));
            readData = String.valueOf(reader.read()).trim();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return readData;
    }
}
