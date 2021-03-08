package AbstractFactory;


import AbstractFactory.Factory.ColorFactory;
import AbstractFactory.Factory.ShapeFactory;

/**
 * @author Soap
 * time 2021-03-06 21:34
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
