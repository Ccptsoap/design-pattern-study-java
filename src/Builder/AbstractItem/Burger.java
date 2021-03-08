package Builder.AbstractItem;

import Builder.Imp.Item;
import Builder.Imp.Packing;
import Builder.Packing.Wrapper;

/**
 * @author Soap
 * time 2021-03-07 0:50
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() { //打包的过程
        return new Wrapper(); //打包的方式
    }
}
