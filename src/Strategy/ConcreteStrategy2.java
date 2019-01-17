package Strategy;

/**
 * @program: design
 * @description:
 * @author: baichen
 * @create: 2019-01-17 17:15
 **/
public class ConcreteStrategy2 implements IStrategy {
    @Override
    public void doSomething() {
        System.out.println("具体策略2的运算法则");
    }
}
