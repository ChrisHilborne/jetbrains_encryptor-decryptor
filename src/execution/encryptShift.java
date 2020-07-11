package execution;

import java.util.ArrayList;

public class encryptShift extends encryptTemplate {
    static final char[] alphabetArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    static ArrayList<Character> alphabetList = new ArrayList<>(26);

    static {
        for (char cha : alphabetArray) {
            alphabetList.add(cha);
        }

    }


    public encryptShift(String data) {
        super(data);
    }

    @Override
    void encryptData(int key) {
        StringBuilder sb = new StringBuilder();
        char[] chars = data.toCharArray();

        for (int i = 0; i < chars.length; i ++) {
            char cha = Character.toLowerCase(chars[i]);
            if (alphabetList.contains(cha)) {
                int shift = alphabetList.indexOf(cha) + key > 25 ? alphabetList.indexOf(cha) + key - 26 : alphabetList.indexOf(cha) + key;
                if (Character.isLowerCase(chars[i])) {
                    sb.append(alphabetArray[shift]);
                } else {
                    sb.append(Character.toUpperCase(alphabetArray[shift]));
                }
            }
            else {
                sb.append(chars[i]);
            }
        }
        encryptedData = sb.toString();
    }



}
