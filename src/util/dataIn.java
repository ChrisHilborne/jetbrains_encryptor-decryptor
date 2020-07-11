package util;

public class dataIn implements In {

    private String data;

    @Override
    public void execute() {

    }

    public dataIn(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}
