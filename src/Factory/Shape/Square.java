package Factory.Shape;

import Factory.Imp.Shape;

/**
 * @author Soap
 * time 2021-03-06 20:43
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square.draw");
    }
}
