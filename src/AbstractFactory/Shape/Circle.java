package AbstractFactory.Shape;

import AbstractFactory.Imp.Shape;

/**
 * @author Soap
 * time 2021-03-06 20:43
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle.draw");
    }
}
