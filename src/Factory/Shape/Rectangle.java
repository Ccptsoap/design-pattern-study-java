package Factory.Shape;

import Factory.Imp.Shape;

/**
 * @author Soap
 * time 2021-03-06 20:41
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle.draw");
    }
}
