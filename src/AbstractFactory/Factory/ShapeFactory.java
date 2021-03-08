package AbstractFactory.Factory;

import AbstractFactory.AbstractFactory;
import AbstractFactory.Imp.Color;
import AbstractFactory.Imp.Shape;
import AbstractFactory.Shape.Circle;
import AbstractFactory.Shape.Rectangle;
import AbstractFactory.Shape.Square;

/**
 * @author Soap
 * time 2021-03-06 20:44
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
