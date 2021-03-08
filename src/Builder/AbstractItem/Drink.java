package Builder.AbstractItem;

import Builder.Imp.Item;
import Builder.Imp.Packing;
import Builder.Packing.Bottle;

/**
 * @author Soap
 * time 2021-03-07 1:01
 */
public abstract class Drink implements Item {
    @Override
    public Packing packing() { //打包的过程
        return new Bottle(); //打包的方式
    }
}
