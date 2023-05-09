package io.turntabl;

import java.util.List;

public class CompoundGraphic implements Graphic {
    private int x;
    private int y;
    private final List<Graphic> children;

    public CompoundGraphic(int x, int y, List<Graphic> children) {
        this.x = x;
        this.y = y;
        this.children = children;
    }

    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("Drawing compound graphic with " + children.size() + " children");
        children.forEach(Graphic::draw);
    }
}
