package execution;

public class encryptUnicode extends encryptTemplate {


    public encryptUnicode(String data) {
        super(data);
    }


    @Override
    public void encryptData(int key) {
        StringBuilder sb = new StringBuilder();
        byte[] cypherBytes = data.getBytes();

        for (byte byt : cypherBytes) {
            byt += key;
            sb.append((char) byt);
        }
        encryptedData = sb.toString();
    }


}
