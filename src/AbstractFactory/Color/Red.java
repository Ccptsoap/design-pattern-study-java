package AbstractFactory.Color;

import AbstractFactory.Imp.Color;

/**
 * @author Soap
 * time 2021-03-06 21:20
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Red.fill");
    }
}
