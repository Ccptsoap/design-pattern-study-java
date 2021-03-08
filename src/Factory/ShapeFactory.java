package Factory;

import Factory.Imp.Shape;
import Factory.Shape.Circle;
import Factory.Shape.Rectangle;
import Factory.Shape.Square;

/**
 * @author Soap
 * time 2021-03-06 20:44
 */
public class ShapeFactory {
    public Shape getShape(String shapeType){
        if(shapeType == null) {
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
}
