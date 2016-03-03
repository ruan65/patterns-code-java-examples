package patterns.facade.shapes;

import patterns.facade.shapes.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square::draw");
    }
}
