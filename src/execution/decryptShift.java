package execution;

import java.util.ArrayList;

public class decryptShift extends decryptTemplate {
    static final char[] alphabetArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    static ArrayList<Character> alphabetList = new ArrayList<>(26);


    static {
        for (char cha : alphabetArray) {
            alphabetList.add(cha);
        }
    }



    public decryptShift(String data) {
        super(data);
    }

    @Override
    void decryptData(int key) {
        StringBuilder sb = new StringBuilder();
        char[] chars = data.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char cha = Character.toLowerCase(chars[i]);
            if (alphabetList.contains(cha)) {
                int shift = alphabetList.indexOf(cha) - key < 0 ? 26 + alphabetList.indexOf(cha) - key : alphabetList.indexOf(cha) - key;
                if (Character.isLowerCase(chars[i])) {
                    sb.append(alphabetArray[shift]);
                } else {
                    sb.append(Character.toUpperCase(alphabetArray[shift]));
                }
            }
            else {
                sb.append(cha);
            }
        }
        decryptedData = sb.toString();

    }
}
