package util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class fileOut implements Out {


    private String fileName;

    public fileOut(String file) {
        this.fileName = file;
    }

    @Override
    public void execute(String data) {
        try {
            File file = new File(fileName);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
