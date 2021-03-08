package AbstractFactory;

import AbstractFactory.Imp.Color;
import AbstractFactory.Imp.Shape;

/**
 * @author Soap
 * time 2021-03-06 21:21
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
