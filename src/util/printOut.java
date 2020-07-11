package util;

public class printOut implements Out {

    public printOut() {
    }

    @Override
    public void execute(String data) {
        System.out.println(data);
    }
}
