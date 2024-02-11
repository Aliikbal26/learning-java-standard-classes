package classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) {

        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("application.properties"));

            String portDatabase = properties.getProperty("port");
            String database = properties.getProperty("database");
            String hostnameDatabase = properties.getProperty("host");

            System.out.println(portDatabase);
            System.out.println(database);
            System.out.println(hostnameDatabase);
        } catch (FileNotFoundException exception) {
            System.out.println("File tidak ditemukan");
            // TODO: handle exception
        } catch (IOException exception) {
            System.out.println("Gagal di load");
        }
    }
}
