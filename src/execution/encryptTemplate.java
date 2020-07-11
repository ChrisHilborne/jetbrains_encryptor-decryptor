package execution;

abstract class encryptTemplate implements encryptDecrypt {

    final String data;
    String encryptedData;

    public encryptTemplate(String data) {
        this.data = data;
    }

    public String execute(int key) {
        encryptData(key);
        return getEncryptedData();
    }


    abstract void encryptData(int key);

    public String getEncryptedData() {
        return encryptedData;
    }

}
