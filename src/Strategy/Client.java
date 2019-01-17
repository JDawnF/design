package Strategy;

/**
 * @program: design
 * @description: 场景类
 * @author: baichen
 * @create: 2019-01-17 17:17
 **/
public class Client {
    public static void main(String[] args) {
        //声明一个具体的策略
        IStrategy strategy = new ConcreteStrategy1();
        //声明上下文对象
        Context context = new Context(strategy);
        //执行封装后的方法
        context.doAnythinig();
    }
}
