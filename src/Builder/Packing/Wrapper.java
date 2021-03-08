package Builder.Packing;

import Builder.Imp.Packing;

/**
 * @author Soap
 * time 2021-03-07 0:46
 * 打包方式:包装
 */
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper 包装";
    }
}
