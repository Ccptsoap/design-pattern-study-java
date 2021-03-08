package Singleton;

/**
 * @author Soap
 * time 2021-03-06 17:34
 * 单例类
 */
public class SingleObject {
    private static SingleObject instace = new SingleObject(); //在装载的时候就实例化单例对象

    //使构建函数私有化，因此外部无法实例化，以此保证单例。
    private SingleObject(){}

    //获取单例的唯一入口
    public static SingleObject getInstance(){
        return instace;
    }

    //业务代码
    public void work(){
        System.out.println("单例模式");
    }
}

