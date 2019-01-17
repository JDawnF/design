package Strategy;

/**
 * @program: design
 * @description: 封装角色
 * @author: baichen
 * @create: 2019-01-17 17:16
 **/
public class Context {
    //抽象策略
    private IStrategy strategy = null;

    //构造函数设置具体策略
    public Context(IStrategy _strategy) {
        this.strategy = _strategy;
    }

    //封装后的策略方法
    public void doAnythinig() {
        this.strategy.doSomething();
    }
}
