package execution;

public class encryptDecryptFactory {

    public static encryptDecrypt build(String mode, String alg, String data) {
        switch (mode) {
            case "enc":
                return alg.equals("unicode") ? new encryptUnicode(data) : new encryptShift(data);
            case "dec":
                return alg.equals("unicode") ? new decryptUnicode(data) : new decryptShift(data);
            default:
                return null;
        }
    }

}
