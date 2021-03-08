package Factory;

import Factory.Imp.Shape;

/**
 * @author Soap
 * time 2021-03-06 20:52
 */
public class Demo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("Square");
        shape3.draw();
    }
}
