package Builder.Packing;

import Builder.Imp.Packing;

/**
 * @author Soap
 * time 2021-03-07 0:48
 * 打包方式:瓶装
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle 瓶装";
    }
}
