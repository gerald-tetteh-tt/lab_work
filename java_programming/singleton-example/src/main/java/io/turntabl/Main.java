package io.turntabl;

public class Main {
    public static void main(String[] args) {
        // create instances of config manager
        ConfigManager firstConfigInstance = ConfigManager.getInstance();
        ConfigManager secondConfigInstance = ConfigManager.getInstance();

        // update one config manager
        firstConfigInstance.update("lt-password","newt$$potter");

        // get new password from manger 2
        String password = secondConfigInstance.get("lt-password");

        // print password
        System.out.println(password);
    }
}