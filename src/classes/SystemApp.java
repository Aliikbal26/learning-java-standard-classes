package classes;

public class SystemApp {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime() / 1000); // nanosegundos

        System.out.println(System.getenv("Ali Ikbal")); /* Mostra o diretorio HOME do usuario */
    }
}
