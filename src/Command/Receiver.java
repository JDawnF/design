package Command;

/**
 * @program: design
 * @description: 通用接受者
 * @author: baichen
 * @create: 2018-12-26 17:43
 **/
public abstract class Receiver {
    //抽象接收者，定义每个接收者都必须完成的业务
    public abstract void doSomething();
}
