package singleton;

/**
 * @program: offer
 * @description: 懒汉式单例模式,加锁
 * @author: baichen
 * @create: 2018-12-01 10:02
 **/
public class Singleton2 {
    private static Singleton2 singleton = null;

    //限制产生多个对象，用private关键字
    private Singleton2() {
    }

    //通过该方法获得实例对象
    public static synchronized Singleton2 getSingleton() {
        if (singleton == null) {
            singleton = new Singleton2();
        }
        return singleton;
    }

    //其他方法
    public static void doSomething() {

    }
}
