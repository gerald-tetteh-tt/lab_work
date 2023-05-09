package io.turntabl.seat;

public abstract class Seat {
    private final Integer id;
    private final String name;

    protected Seat(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
