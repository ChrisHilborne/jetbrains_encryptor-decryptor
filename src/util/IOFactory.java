package util;

public class IOFactory {

    public static In buildIn(String arg, String data) {
        switch (arg) {
            case "data":
                return new dataIn(data);
            case "in":
                return new fileIn(data);
            default:
                return null;
        }
    }

    public static Out buildOut(String arg, String data) {
        switch (arg) {
            case "fileOut":
                return new fileOut(data);
            case "printOut":
                return new printOut();
            default:
                return null;
        }
    }

}
