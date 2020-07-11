package util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class fileIn implements In {

    private String file;
    private String data;

    public fileIn(String file) {
        this.file = file;
    }

    public String getData() {
        return data;
    }


    @Override
    public void execute() {
        try {
            data = new String(Files.readAllBytes(Paths.get(file)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
