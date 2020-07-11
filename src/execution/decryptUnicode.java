package execution;

public class decryptUnicode extends decryptTemplate {

    public decryptUnicode(String data) {
        super(data);
    }

    @Override
    void decryptData(int key) {
        StringBuilder sb = new StringBuilder();
        byte[] cypherBytes = data.getBytes();

        for (byte byt : cypherBytes) {
            byt -= key;
            sb.append((char) byt);
        }
        decryptedData = sb.toString();
    }
}
