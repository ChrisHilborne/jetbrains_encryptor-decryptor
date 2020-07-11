package execution;

abstract class decryptTemplate implements encryptDecrypt {

        final String data;
        String decryptedData;

        public decryptTemplate(String data) {
            this.data = data;
        }

        @Override
        public String execute(int key) {
            decryptData(key);
            return getDecryptedData();
        }


        abstract void decryptData(int key);

        public String getDecryptedData() {
            return decryptedData;
        }

    }

