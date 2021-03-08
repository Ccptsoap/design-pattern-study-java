package Prototype;

import Prototype.Item.Circle;
import Prototype.Item.Rectangle;
import Prototype.Item.Square;

import java.util.HashMap;

/**
 * @author Soap
 * time 2021-03-07 1:46
 */
public class ShapeCache {
    private static HashMap<String, Shape> shapeMap = new HashMap<String, Shape>();

    public static Shape getShape(String shapeId) {
        Shape shape = shapeMap.get(shapeId);
        try {
            return (Shape) shape.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    //从数据源载入数据,一般是从数据库.
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
