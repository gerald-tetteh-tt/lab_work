package io.turntabl.io.exception;

public class RoomCapacityExceededException extends RuntimeException {

    public RoomCapacityExceededException(String message) {
        super(message);
    }
}
