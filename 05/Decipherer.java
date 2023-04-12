public class Decipherer {
    public static String decipherMessage(String message) {
        int keyLength = message.length() / 2;
        String subString = message.substring(5, 5 + keyLength);
        String decodedString = subString.replace("@#?", " ");
        String reversedString = new StringBuilder(decodedString).reverse().toString();
        return reversedString;
    }

    public static void main(String[] args) {
        String[] messages = {"0@sn9sirppa@#?ia'jgtvryko1", "q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj", "aopi?sedohtém@#?sedhtmg+p9l!"};
        for (String message : messages) {
            System.out.println("Message d'origine : " + message);
            String decipheredMessage = decipherMessage(message);
            System.out.println("Message déchiffré : " + decipheredMessage);
            System.out.println();
        }
    }
}
