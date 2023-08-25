package solid.live_refactored.dip;

import java.util.*;
public class EncodingModule {
    public void encodeWithFiles() {
        IOHandler io = new IOHandler();
        String aLine = io.readData();
        if (aLine != "") {
            byte[] encodedBytes = Base64.getEncoder().encode(aLine.getBytes());
            String encodedLine = new String(encodedBytes);
            io.writeData(encodedLine);
        }
    }

    public void encodeBasedOnNetworkAndDatabase() {
        NetworkOperationHandler io = new NetworkOperationHandler();
        String inputString = io.readData();
        byte[] encodedBytes = Base64.getEncoder().encode(inputString.getBytes());
        String encodedString = new String(encodedBytes);
        io.writeData(encodedString);
    }
}
