package AbstractFactory.Factory;

import AbstractFactory.AbstractFactory;
import AbstractFactory.Imp.Color;
import AbstractFactory.Color.Blue;
import AbstractFactory.Color.Green;
import AbstractFactory.Color.Red;
import AbstractFactory.Imp.Shape;

/**
 * @author Soap
 * time 2021-03-06 21:25
 * 颜色工厂类
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){
        return null;
    }

    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }
}