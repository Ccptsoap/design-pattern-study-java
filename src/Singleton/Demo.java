package Singleton;

/**
 * @author Soap
 * time 2021-03-06 17:40
 * 单例模式
 * https://www.runoob.com/design-pattern/singleton-pattern.html
 */
public class Demo {
    public static void main(String[] args) {
        SingleObject object = SingleObject.getInstance();
        object.work();
    }
}
