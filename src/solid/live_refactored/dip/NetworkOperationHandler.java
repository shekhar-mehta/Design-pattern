package solid.live_refactored.dip;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class NetworkOperationHandler implements IOInterface{
    @Override
    public String readData() {
        URL url = null;
        try {
            url = new URL("http", "myfirstappwith.appspot.com", "index.html");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        InputStream input = null;
        try {
            input = url.openStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        InputStreamReader reader = new InputStreamReader(input);
        StringBuilder inputString = new StringBuilder();
        try {
            int readCharacter;
            readCharacter = reader.read();
            while (readCharacter != -1) {
                inputString.append((char) readCharacter);
                readCharacter = reader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return String.valueOf(inputString);
    }
    @Override
    public void writeData(String data) {
        MyDatabase myDatabase = new MyDatabase();
        myDatabase.write(data);
    }
}
