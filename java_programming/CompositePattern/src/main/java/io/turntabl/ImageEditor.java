package io.turntabl;

public class ImageEditor {
    private final Graphic graphic;

    public ImageEditor(Graphic graphic) {
        this.graphic = graphic;
    }

    public void draw() {
        graphic.draw();
    }
}
