package io.turntabl;

public class Circle implements Graphic {
    private double radius;
    private int x;
    private int y;

    public Circle(double radius, int x, int y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("Draw circle of radius: " + radius);
    }
}
