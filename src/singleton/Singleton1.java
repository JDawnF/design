package singleton;

/**
 * @program: offer
 * @description: 饿汉式单例模式
 * @author: baichen
 * @create: 2018-12-01 10:02
 **/
public class Singleton1 {
    private final static Singleton1 singleton = new Singleton1();
    //限制产生多个对象，用private关键字
    private Singleton1(){}
    //通过该方法获得实例对象
    public static Singleton1 getSingleton(){
        return singleton;
    }
    //其他方法
    public static void doSomething(){

    }
}
