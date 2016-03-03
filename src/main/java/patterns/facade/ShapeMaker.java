package patterns.facade;

import patterns.facade.shapes.Circle;
import patterns.facade.shapes.Rectangle;
import patterns.facade.shapes.Shape;
import patterns.facade.shapes.Square;

public class ShapeMaker {

    private Shape circle, rectangle, square;

    public ShapeMaker() {
        this.circle = new Circle();
        this.rectangle = new Rectangle();
        this.square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
