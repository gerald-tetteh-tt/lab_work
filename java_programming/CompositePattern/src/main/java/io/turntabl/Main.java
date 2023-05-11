package io.turntabl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        var item = new CompoundGraphic(40,30, List.of(
                new Dot(3,5),
                new Circle(3,5,65),
                new Dot(3,5)
        ));
        var item2 = new CompoundGraphic(40,30, List.of(
                new Dot(3,5),
                new Circle(3,5,65),
                new Dot(3,5),
                item
        ));
        List<Graphic> graphics = List.of(
                new Dot(3,5),
                new Circle(3,5,65),
                new Dot(3,5),
                new Dot(3,5),
                new Circle(3,5,54),
                new Dot(3,5),
                new Dot(3,5),
                new Circle(3,5, 6)
        );
        ImageEditor editor = new ImageEditor(new CompoundGraphic(0,0,graphics));
        editor.draw();
    }
}