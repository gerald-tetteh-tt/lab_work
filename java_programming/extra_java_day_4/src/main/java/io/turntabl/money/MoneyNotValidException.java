package io.turntabl.money;

public class MoneyNotValidException extends Exception {
    public MoneyNotValidException(String message) {
        super(message);
    }
}
