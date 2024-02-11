package classes;

import java.util.Base64;

public class Base64App {
    public static void main(String[] args) {

        String original = "Ali Ikbal";

        String encoded = Base64.getEncoder().encodeToString(original.getBytes());
        System.out.println(encoded); // WU91YW5pZ2h0

        byte[] bytes = Base64.getDecoder().decode(encoded);
        String result = new String(bytes);

        System.out.println(result); // Ali Ikbal
    }
}
