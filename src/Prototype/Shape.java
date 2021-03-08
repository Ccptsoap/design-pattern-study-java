package Prototype;

/**
 * @author Soap
 * time 2021-03-07 1:35
 */
public abstract class Shape implements Cloneable {
    private String id;
    protected String type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //重载克隆方法,使其为深拷贝.
    // 注意clone()的返回值为Object,使用时应强制转换为业务类.
    @Override
    public Object clone() throws CloneNotSupportedException {
        Object clone = super.clone();
        return clone;
    }
}
