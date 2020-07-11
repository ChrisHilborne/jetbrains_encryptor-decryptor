import util.In;
import util.Out;
import util.IOFactory;
import execution.encryptDecrypt;
import execution.encryptDecryptFactory;


public class Main {


    public static void main(String[] args) {

        String fileIn = "";
        String data = "";
        String fileOut = "";
        String mode = "enc";
        String alg = "switch";
        int key = 0;

        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "-key":
                    key = Integer.parseInt(args[i + 1]);
                    break;
                case "-mode":
                    mode = args[i + 1];
                    break;
                case "-alg":
                    alg = args[i + 1];
                    break;
                case "-in":
                    fileIn = args[i + 1];
                    break;
                case "-out":
                    fileOut = args[i + 1];
                    break;
                case "-data":
                    data = args[i + 1];
            }
        }

        In in = !fileIn.equals("") ? IOFactory.buildIn("in", fileIn) : IOFactory.buildIn("data", data);

        assert in != null;
        in.execute();
        String cypher = in.getData();

        encryptDecrypt encryptDecrypt = encryptDecryptFactory.build(mode, alg, cypher);

        assert encryptDecrypt != null;
        cypher = encryptDecrypt.execute(key);

        Out out = !fileOut.equals("") ? IOFactory.buildOut("fileOut", fileOut) : IOFactory.buildOut("printOut", null);
        assert out != null;
        out.execute(cypher);



    }


}
