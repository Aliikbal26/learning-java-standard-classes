package classes;

import java.util.UUID;

public class UuidApp {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {

            UUID uuid = UUID.randomUUID();
            // konversi ke string
            String key = uuid.toString();

            System.out.println(key);

        }
    }
}
